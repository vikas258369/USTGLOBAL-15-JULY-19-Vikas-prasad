package com.ust.Management.HotelManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

class HotelTest implements Operations {

	double price = 0.00;
	double p = 0.00;
	public void showAll() {
		Scanner sc = new Scanner(System.in);
		HotelBilling hb = new HotelBilling();

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			emf = Persistence.createEntityManagerFactory("Persistence1");
			em = emf.createEntityManager();

			String jpql = "from HotelBilling";
			Query qr = em.createQuery(jpql);
			// qr.executeUpdate();
			System.out.println("fjgkfjghjf");
			List<HotelBilling> li = qr.getResultList();

			for (HotelBilling h : li) {
				System.out.println("*****************************");
				System.out.println(h.getItemCode());
				System.out.println(h.getFoodName());
				System.out.println(h.getPrice());
				System.out.println("*****************************");
			}

			System.out.println(li);
		} catch (Exception e) {

		}

	}

	public void toOrder() {
		Scanner sc = new Scanner(System.in);
		HotelBilling hb = new HotelBilling();
		
		 
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
        
        	
       
		try {
			emf = Persistence.createEntityManagerFactory("Persistence1");
			em = emf.createEntityManager();

			ArrayList<HotelBilling> li = new ArrayList<HotelBilling>();
			int x = 0;
			
			do {
				System.out.println("enter the id  to order:");
				HotelBilling hbfind = em.find(HotelBilling.class, Integer.parseInt(sc.nextLine()));

				li.add(hbfind);
				System.out.println(li);
				price = 0.00;
				for (HotelBilling h : li) {
					System.out.println(h.getItemCode() + " " + h.getFoodName() + " " + h.getPrice());
					
					price = price + h.getPrice();
					
				}
				System.out.println("************Total Bill:" + price + "***********");
				System.out.println("do you want to add more:(0/1)");
				x = Integer.parseInt(sc.nextLine());
			} while (x == 1);
			
			System.out.println("...........yours order........");
			
		} catch (Exception e) {

		}
        

		p= p+price;
	}

	public void addFood() {
		Scanner sc = new Scanner(System.in);
		HotelBilling hb = new HotelBilling();

		System.out.println("eneter the Item Code");
		hb.setItemCode(Integer.parseInt(sc.nextLine()));

		System.out.println("eneter the Food Name");
		hb.setFoodName(sc.nextLine());

		System.out.println("enter the Price");
		hb.setPrice(Double.parseDouble(sc.nextLine()));

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		try {

			emf = Persistence.createEntityManagerFactory("Persistence1");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			em.persist(hb);
			System.out.println("data inserted...");
			et.commit();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong!!");
		}

		
	}

	public void updateFood() {

		Scanner sc = new Scanner(System.in);
		HotelBilling hb = new HotelBilling();

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			emf = Persistence.createEntityManagerFactory("Persistence1");
			em = emf.createEntityManager();
			et = em.getTransaction();

			System.out.println("eneter the Item Code you want to update:");

			HotelBilling hbfind = em.find(HotelBilling.class, Integer.parseInt(sc.nextLine()));

			System.out.println("eneter the Food Name");
			hbfind.setFoodName(sc.nextLine());

			System.out.println("enter the Price");
			hbfind.setPrice(Double.parseDouble(sc.nextLine()));

			et.begin();
			em.persist(hbfind);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//e.printStackTrace();
		}

		
	}

	public void deleteFood() {
		Scanner sc = new Scanner(System.in);
		HotelBilling hb = new HotelBilling();

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			emf = Persistence.createEntityManagerFactory("Persistence1");
			em = emf.createEntityManager();
			et = em.getTransaction();

			System.out.println("eneter the Item Code you want to delete:");

			HotelBilling hbfind = em.find(HotelBilling.class, Integer.parseInt(sc.nextLine()));

			et.begin();
			em.remove(hbfind);
			System.out.println("Food deleted");
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//e.printStackTrace();
		}
		
	}

	public void totalBill() {
      
	  System.out.println("Today Sales:"+p);		
	}

}