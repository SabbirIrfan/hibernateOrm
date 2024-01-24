package org.example.dao;

import org.example.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


public class StudentDao {

    private HibernateTemplate hibernateTemplate;
    @Transactional
    public  int insert(Student student){
    return (Integer) this.hibernateTemplate.save(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
