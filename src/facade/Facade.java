/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Project;
import entity.ProjectUser;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Jeanette
 */
public class Facade
{

    EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }

    public ProjectUser createUser(ProjectUser pu)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(pu);
            em.getTransaction().commit();
            return em.find(ProjectUser.class, pu.getId());
        } finally
        {
            em.close();
        }
    }

    public ProjectUser findUser(long id)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            return em.find(ProjectUser.class, id);
        } finally
        {
            em.close();
        }
    }

    public List<ProjectUser> findAllUser()
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            List<ProjectUser> ListPU = em.createNamedQuery("ProjectUser.findAll").getResultList();
            return ListPU;
        } finally
        {
            em.close();
        }
    }

    public Project createProject(Project p)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return em.find(Project.class, p.getId());
        } finally
        {
            em.close();
        }
    }

    public void assignUserToProject(int projectid, int userid)
    {
        EntityManager em = emf.createEntityManager();
        try
        {

        } finally
        {
            em.close();
        }
    }

    public Project findProject(long id)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            return em.find(Project.class, id);
        } finally
        {
            em.close();
        }
    }

    public void CreateTaskAndAssignToProject(int i, int j)
    {
        EntityManager em = emf.createEntityManager();
        try
        {

        } finally
        {
            em.close();
        }
    }
}
