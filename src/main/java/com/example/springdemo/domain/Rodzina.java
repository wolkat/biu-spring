package com.example.springdemo.domain;

import java.util.List;
import com.example.springdemo.domain.Osoba;



public class Rodzina {

		
		private List<Osoba> dzieci;
		
		private Osoba mama;
		private Osoba tata;
		public List<Osoba> getDzieci() {
			return dzieci;
		}
		public void setDzieci(List<Osoba> dzieci) {
			this.dzieci = dzieci;
		}
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
		
	

}
