/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Jeanette
 */
@Entity
@NamedQueries(
        {
            @NamedQuery(name = "ProjectUser.findAll", query = "SELECT pu FROM ProjectUser pu"),
            
        })
public class ProjectUser
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String created;
    @ManyToMany
    private List<Project> project;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getCreated()
    {
        return created;
    }

    public void setCreated(String created)
    {
        this.created = created;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public List<Project> getProject()
    {
        return project;
    }

    public void setProject(List<Project> project)
    {
        this.project = project;
    }

    @Override
    public String toString()
    {
        return "ProjectUser{" + "id=" + id + ", userName=" + userName + ", email=" + email + ", created=" + created + ", project=" + project + '}';
    }

}
