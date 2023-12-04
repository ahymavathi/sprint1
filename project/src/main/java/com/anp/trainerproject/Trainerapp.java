package com.anp.trainerproject;
import java.util.List;
import java.util.Optional;
import org.hibernate.HibernateException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Trainerapp {

public static void main(String[] args) {
		
EntityManagerFactory factory = null;
		
		
try { 
			
	factory  = Persistence.createEntityManagerFactory("arjun");
			
	EntityManager em = factory.createEntityManager();
						
	System.out.println("------WELCOME TO TrainerManagementSystem------");
			
			Trainer t1 = new Trainer(1, "hyma", "vathi", 90000,"hyma@email.com",  "Female");
			Trainer t2 = new Trainer(2, "indravani", "vani",  70000,"indravani@email.com",  "Male");
			Trainer t3 = new Trainer(3, "Sravani", "patel", 49000,"sravani@email.com", "Male");
			
			TrainerDAO tDAO = new TrainerDAO(em);
			tDAO.save(t1);
			tDAO.save(t2);
			tDAO.save(t3);
			
			System.out.println("Data added successfully");

			System.out.println("--------------------------");
			
			System.out.println(" Trainer  details based on the id :");
			Optional<Trainer> TrainerById = tDAO.findById(1);
			System.out.println(TrainerById);
			 
			
			System.out.println("--------------------------");
			
			System.out.println(" All Details of Trainer ");	 
			List<Trainer> alltr = tDAO.findAll();
			System.out.println(alltr);
			
			
			
			System.out.println("------------------");
		
			
			int  nid = 3;
			String nfirstName ="indra" ;
			String nLastName = "vani" ;
			int salary =  70000 ;
			String nemail = "indravani@gmail.com";
			String ngender  ="female";
			
			tDAO.updateTrainer(nid, nfirstName, nLastName,salary, nemail, ngender);
			
			System.out.println("Data updated sucessfully");
			
			
			System.out.println("------------------"); 
			
			System.out.println("Removeing based on the id :");
			
			tDAO.remove(2);
			
			System.out.println("2nd record is removed");
			
			
		}
		catch (HibernateException e) {
			 e.printStackTrace();
		}
		catch (Exception e) {
		 e.printStackTrace();
		}

	}


	}

