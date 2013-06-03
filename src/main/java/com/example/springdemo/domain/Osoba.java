package com.example.springdemo.domain;

public class Osoba {
		private String imie;
		private int rokUr;
		private Osoba mama;
		private Osoba tata;
		
		
		public Osoba getMama() {
			return mama;
		}
		public void setMama(Osoba mama) {
			this.mama = mama;
		}
		public Osoba getTata() {
			return tata;
		}
		public void setTata(Osoba tata) {
			this.tata = tata;
		}
		
		public String getImie() {
			return imie;
		}
		public void setImie(String imie) {
			this.imie = imie;
		}
		public int getRokUr() {
			return rokUr;
		}
		public void setRokUr(int rokUr) {
			this.rokUr = rokUr;
		}
		
}
