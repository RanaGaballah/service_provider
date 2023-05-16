import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("____________ Welcome to our System _________");
		Accounts acc = new Accounts();
		Boolean RESULT = null;
		RefundRequest R1 = new RefundRequest();
		RegisteredUser u1 = new RegisteredUser("asmaa", "20201019", "asmaa@gmail", acc);
		RegisteredUser u2 = new RegisteredUser("rana", "20201070", "rana@gmail", acc);
		RegisteredUser u3 = new RegisteredUser("safa", "20201103", "safa@gmail", acc);
		acc.accounts.add(u1);
		acc.accounts.add(u2);
		acc.accounts.add(u3);
		MainMenu();
		System.out.print("Enter your choice : ");
		int num = input.nextInt();
		while (num < 4) {
			// register as an admin
			if (num == 1) {
				Admin admin = new Admin();
				if (admin.SinginAdmin()) {
					Admin.AdminMenu();
					System.out.print("Enter your choice : ");
					int num2 = input.nextInt();
					while (num2 < 3) {
						// review refund requests
						if (num2 == 1) {
							RESULT = admin.checkReqests(R1);
							Admin.AdminMenu();
							System.out.print("Enter your choice : ");
							num2 = input.nextInt();
						}
						// return back
						if (num2 == 2) {
							MainMenu();
							System.out.print("Enter your choice : ");
							num = input.nextInt();
							break;
						}
					}
				} else {
					System.out.println("InCorrect Account..");
				}
			}
			// Register as a registered User
			else if (num == 2) {
				RegisteredUser regUser = new RegisteredUser();
				CreditCard card = new CreditCard(20000);
				wallet w1 = new wallet();
				String service = "";
				// user account found and register successfully
				if (regUser.sign_in(acc)) {
					RegisteredUser.registeredUserMenu();
					System.out.print("Enter your choice : ");
					int select = input.nextInt();
					while (select < 6) {
						// search for services
						if (select == 1) {
							regUser.SearchServices();
							RegisteredUser.registeredUserMenu();
							System.out.print("Enter your choice : ");
							select = input.nextInt();
						}
						// services menu
						else if (select == 2) {
							Services.ServicesMenu();
							System.out.print("Enter your choice : ");
							int num3 = input.nextInt();
							while (num3 < 6) {
								// mobile recharge service
								if (num3 == 1 || num3 == 2) {
									Services s1 = new Services();
									if (num3 == 1 || service == "mobile") {
										s1 = new MobileRecharge();
									} else if (num3 == 2 || service == "internet") {
										s1 = new InternetRecharge();
									}
									ServiceProvider.ServiceProvidersMenu();
									int sp = input.nextInt();
									// if vodafone
									if (sp == 1) {
										ServiceProvider sp1 = new VodafoneSP();
										sp1.form();
										payment.paymentWays();
										int pway = input.nextInt();
										if (pway == 1) {
											payment p = card;
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											System.out.println(p.getDescription() + p.cost(sp1) + " EGP");
										} else if (pway == 2) {
											payment p = new Cahce();
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											System.out.println(
													p.getDescription() + p.cost(sp1) + " EGP pay cache on delivery");
										} else if (pway == 3) {
											payment p = w1;
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											if (p.cost(sp1) >= 0) {
												System.out.println(p.getDescription() + "consumed " + p.cost(sp1)
														+ " EGP from your wallet");
											}
										}
									}
									if (sp == 2) {
										ServiceProvider sp2 = new EtisalatSP();
										sp2.form();
										payment.paymentWays();
										int pway = input.nextInt();
										if (pway == 1) {
											payment p = card;
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											System.out.println(p.getDescription() + p.cost(sp2) + " EGP");
										} else if (pway == 2) {
											payment p = new Cahce();
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											System.out.println(
													p.getDescription() + p.cost(sp2) + " EGP pay cache on delivery");
										} else if (pway == 3) {
											payment p = w1;
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											if (p.cost(sp2) >= 0) {
												System.out.println(p.getDescription() + " consumed " + p.cost(sp2)
														+ " EGP from your wallet");
											}
										}
									}
									if (sp == 3) {
										ServiceProvider sp3 = new OrangeSP();
										sp3.form();
										payment.paymentWays();
										int pway = input.nextInt();
										if (pway == 1) {
											payment p = card;
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											System.out.println(p.getDescription() + p.cost(sp3) + " EGP");
										} else if (pway == 2) {
											payment p = new Cahce();
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											System.out.println(
													p.getDescription() + p.cost(sp3) + " EGP pay cache on delivery");
										} else if (pway == 3) {
											payment p = w1;
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											if (p.cost(sp3) >= 0) {
												System.out.println(p.getDescription() + " consumed " + p.cost(sp3)
														+ " EGP from your wallet");
											}
										}
									}
									if (sp == 4) {
										ServiceProvider sp4 = new WeSP();
										sp4.form();
										payment.paymentWays();
										int pway = input.nextInt();
										if (pway == 1) {
											payment p = card;
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											System.out.println(p.getDescription() + p.cost(sp4) + " EGP");
										} else if (pway == 2) {
											payment p = new Cahce();
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else {
												p = new SpecificDiscount(p);
											}
											System.out.println(
													p.getDescription() + p.cost(sp4) + " EGP pay cache on delivery");
										} else if (pway == 3) {
											payment p = w1;
											s1.GetPaymentTech(p);
											Discount.DiscountMenu();
											int disc = input.nextInt();
											if (disc == 1) {
												p = new OverallDiscount(p);
											} else if (disc == 2) {
												p = new SpecificDiscount(p);
											}
											if (p.cost(sp4) >= 0) {
												System.out.println(p.getDescription() + " consumed " + p.cost(sp4)
														+ " EGP from your wallet");
											}
										}
									}
									RefundRequest.RefundMenu();
									System.out.println("Enter your choice : ");
									int Rchoise = input.nextInt();
									if (Rchoise == 1) {
										System.out.println("Confirmed");
									} else {
										R1.RefundRequestForm();
									}
									Services.ServicesMenu();
									System.out.print("Enter your choice : ");
									num3 = input.nextInt();
								}
								// LandLine
								else if (num3 == 3) {
									System.out.println(" 1- Monthly Receipt \n 2- Quarter Receipt \n");
									System.out.print("Enter your choice :");
									int choiceOfLandLine = input.nextInt();
									Landline landline = new Landline();
									if (choiceOfLandLine == 1) {
										landline = new MonthlyReceipt();
										System.out.print("Enter Your landline number :");
										String n  = input.nextLine();
										landline.setLandlineNumber(n); 
										System.out.println("Receipt :  50 EGP  ");
										payment.paymentWays();
										int payforlandline = input.nextInt();
										System.out.println("Done");
									} else {
										landline = new QuarterReceipt();
										System.out.print("Enter Your landline number :");
										String n  = input.nextLine();
										landline.setLandlineNumber(n); 
										System.out.println("Receipt :  200 EGP  ");
										payment.paymentWays();
										int payforlandline = input.nextInt();
										System.out.println("Done");
									}
									RefundRequest.RefundMenu();
									System.out.println("Enter your choice : ");
									int Refundchoise = input.nextInt();
									if (Refundchoise == 1) {
										System.out.println("Confirmed");
									} else {
										R1.RefundRequestForm();
									}
									Services.ServicesMenu();
									System.out.print("Enter your choice : ");
									num3 = input.nextInt();
								}
								// Donations
								else if (num3 == 4) {
									Donations D1 = new Donations();
									System.out.println("1- Hospital \n2- Schools \n3- NGOs (Non profitable organizations) \n");
									System.out.print("Enter your choice : ");
									int x = input.nextInt();
									if (x == 1) {
										D1 = new HospitalDonations();
										D1.DonationsInfo();
										payment.paymentWays();
										int payfordno = input.nextInt();
										System.out.println("Done");
									} else if (x == 2) {
										D1 = new SchoolDonations();
										D1.DonationsInfo();
										payment.paymentWays();
										int payfordno = input.nextInt();
										System.out.println("Done");
									} else {
										D1 = new NGOsDonations();
										D1.DonationsInfo();
										payment.paymentWays();
										int payfordno = input.nextInt();
										System.out.println("Done");
									}
									RefundRequest.RefundMenu();
									System.out.print("Enter your choice : ");
									int Rchoise = input.nextInt();
									if (Rchoise == 1) {
										System.out.println("Confirmed");
									} else {

										R1.RefundRequestForm();
									}
									Services.ServicesMenu();
									System.out.print("Enter your choice : ");
									num3 = input.nextInt();
								}
								// Return back
								else if (num3 == 5) {
									RegisteredUser.registeredUserMenu();
									System.out.print("Enter your choice : ");
									select = input.nextInt();
									break;
								}
							}
						} // add to wallet
						else if (select == 3) {
							System.out.println("How much fund do you want to add to your wallet ?");
							double funds = input.nextDouble();
							w1.AddToWallet(card, funds);
							System.out.println(w1.getBalance() + " EGP");
							RegisteredUser.registeredUserMenu();
							System.out.print("Enter your choice : ");
							select = input.nextInt();
						} else if (select == 4) {
							if (RESULT == null) {
								System.out.print("\nThere is no refund requests till now\n");

							} else if (RESULT) {
								System.out.print("\nYour Refund Request has been accepted successfully ;)\n");
							} else {
								System.out.print("\nYour Refund Request has been rejected sorry :(\n");
							}
							RegisteredUser.registeredUserMenu();
							System.out.print("Enter your choice : ");
							select = input.nextInt();
						} else if (select == 5) {
							MainMenu();
							System.out.print("Enter your choice : ");
							num = input.nextInt();
							break;
						}
					}
				} else {
					System.out.println("Not valid data account");
				}
			}
			// register as an unregistered user
			else if (num == 3) {
				UnregisteredUser UnregUser = new UnregisteredUser();
				boolean chk = UnregUser.signup(acc);
				if (chk) {
					MainMenu();
					System.out.print("Enter your choice : ");
					num = input.nextInt();
				}
			}
			// exit
			else if (num == 4) {
				System.out.println("thank you for visiting our System");
				System.exit(0);
			}
		}
	}

	public static void MainMenu() {
		System.out.print("\n");
		System.out.println("1- Register as an Admin");
		System.out.println("2- Register as a registered User (sing in)");
		System.out.println("3- Register as an Unregistered User (sing up)");
		System.out.println("4- Exit");
	}
}
