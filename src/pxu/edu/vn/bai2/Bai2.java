package pxu.edu.vn.bai2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int n;
				Scanner sc = new Scanner(System.in);
				int luachon = 0;
				do {
					System.out.println("MENU ---------- ");
					System.out.println("Vui lòng chọn chức năng: ");
					System.out.println(
							"1.	Thêm sinh viên vào danh sách.\n" 
									+ "2.	Hiển thị câu chào.\n" 
									+ "0.   	Thoát khỏi chương trình");
					luachon = sc.nextInt();
					sc.nextLine();
					if (luachon == 2) {
						try {
							System.out.print("nhap N: ");
							n = sc.nextInt();
							for (int i = 0; i < n; i++) {
								System.out.println("LẬP TRÌNH JAVA");
							}
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Nhap sai du lieu");
						}

					} else if(luachon == 1) {
						try {
							int a, b, x;
							System.out.print("nhap a: ");
							a = sc.nextInt();
							System.out.print("nhap b: ");
							b = sc.nextInt();
							System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
							if (a == 0) {
								if (b == 0) {
									System.out.println("Phương trình này có vô số nghiệm.");
								} else {
									System.out.println("Phương trình vô nghiệm.");
								}
							} else {
								x = (int) ((double) -b / a);
								System.out.println("Phương trình có nghiệm x = " + x + ".");
							}
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Nhap sai du lieu");
						}
					}
				} while (luachon != 0);
				System.out.println("exit program.....");
	}

}
