package xyz.cglzwz;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntityTest {
    private Logger log = LoggerFactory.getLogger(EntityTest.class);

    @Test
    public void testNull() {
        Staff staff = new Staff();
        log.info("String: " + staff.getName());
        log.info("int: " + staff.getGrade());
        log.info("Integer: " + staff.getId());

    }
}


class Staff {
    private String name;
    private int grade;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
