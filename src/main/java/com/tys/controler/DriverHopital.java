package com.tys.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tys.onetomany.dto.Branch;
import com.tys.onetomany.dto.Hospital;

public class DriverHopital {

	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rahul");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
    Hospital hospital=new Hospital();
    hospital.setFounder("parvin");
    hospital.setGst(898.8);
    hospital.setName("appolo btm");
    
    Branch branch=new Branch();
    branch.setEmail("rajbveer");
    branch.setName("Btm-parvin-branch");
    branch.setPhone(98776876);
    Branch branch1=new Branch();
    branch1.setEmail("rajbveer");
    branch1.setName("Btm-parvin-branch");
    branch1.setPhone(98776876);
    
    List<Branch> list=new ArrayList();
   list.add(branch1);
   list.add(branch);
   hospital.setBranches(list);
    entityTransaction.begin();
    entityManager.persist(branch);
    entityManager.persist(branch1);
    entityManager.persist(hospital);
    entityTransaction.commit();
    
   
    
    

	}

}
