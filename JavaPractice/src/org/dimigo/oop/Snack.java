package org.dimigo.oop;
public class Snack {
		private String name;
		private String company;
		private int price;
		private int number;
		
		public Snack() {
			System.out.println("나는 기본생성자이다!!!");
		}

		public Snack(String newName, String newCompany, int newPrice, int newNumber) {
			name = newName;
			company = newCompany;
			price = newPrice;
			number = newNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}
		
		public void printSnack() {
			System.out.println("이름 : " + name);
			System.out.println("제조사 : " + company);
			System.out.println("가격 : " + price + "원");
			System.out.println("개수 : " + number + "개");
		}
		
		public int calcPrice() { 
			return price*number;
		}
}
