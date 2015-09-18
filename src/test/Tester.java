/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Project;
import entity.ProjectUser;
import facade.Facade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jeanette
 */
public class Tester
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence_with_JPAPU");
        
        Facade f = new Facade(emf);
        
        ProjectUser pj = new ProjectUser();
        pj.setUserName("Mette");
        pj.setEmail("Miriian@hotmail.com");
        pj.setCreated("i går");
        
        System.out.println(f.createUser(pj));
        
        Project p = new Project();
        p.setName("Thing");
        p.setCreated("i går");
        p.setDescription("Hej med dig");
        p.setLastModified("Lige nu");
        
        System.out.println(f.findUser(1));
        System.out.println(f.findAllUser());
        System.out.println(f.createProject(p));
        System.out.println(f.findProject(1));
        
        
    }
}
