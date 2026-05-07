package com.example.demo;

public class Student {
    private int adno;
    private String name;
    private String address;

    public Student() {}

        public Student(int adno, String name, String address) {
        this.setAdno(adno);
        this.setName(name);
        this.setAddress(address);
    }

		public int getAdno() {
			return adno;
		}

		public void setAdno(int adno) {
			this.adno = adno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address){
			this.address = address;
		}


   
}