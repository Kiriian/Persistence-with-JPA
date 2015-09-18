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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jeanette
 */
@Entity
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private long hoursAssigned;
    private long hoursUsed;
    @ManyToOne
    private Project project;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public long getHoursAssigned()
    {
        return hoursAssigned;
    }

    public void setHoursAssigned(long hoursAssigned)
    {
        this.hoursAssigned = hoursAssigned;
    }

    public long getHoursUsed()
    {
        return hoursUsed;
    }

    public void setHoursUsed(long hoursUsed)
    {
        this.hoursUsed = hoursUsed;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Project getProject()
    {
        return project;
    }

    public void setProject(Project project)
    {
        this.project = project;
    }
    
    
    

}
