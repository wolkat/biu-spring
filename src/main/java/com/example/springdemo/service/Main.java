package com.example.springdemo.service;

import java.util.Iterator;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.domain.*;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Osoba o = (Osoba) context.getBean("janK");
		System.out.println("Osoba z kontekstu o imieniu " + o.getImie() + " urodzona "+ o.getRokUr() );
		
		Rodzina r = (Rodzina) context.getBean("kowalscy");
		System.out.println("Mama "+ r.getMama().getImie());
		System.out.println("Dziecko o imieniu: " + r.getDzieci().get(0).getImie());
		System.out.println("Dziecko o imieniu: " + r.getDzieci().get(1).getImie());
		
		Rodzina n = (Rodzina) context.getBean("nowakowie");
		System.out.println("Mama "+ n.getMama().getImie());
		System.out.println("Dziecko o imieniu: " + n.getDzieci().get(0).getImie() 
				+ " ma tatê o imieniu " + n.getDzieci().get(0).getTata().getImie());
		System.out.println("Dziecko o imieniu: " + n.getDzieci().get(1).getImie());
		
		
		System.out.println("\nMieszkañcy kamienicy:");
		Dom d = (Dom) context.getBean("kamienica");
		//for ( Iterator<d> i = 0; i.hasNext())
			
		//System.out.println(d.getRodzina());
	}

}
