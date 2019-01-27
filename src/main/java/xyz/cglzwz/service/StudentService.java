package xyz.cglzwz.service;

import xyz.cglzwz.domain.Student;

import java.util.List;

/**
 * 对Student的CRUD
 *
 * @author chgl16
 * @date 2019-1-25 21:32
 * @version 1.0
 */

public interface StudentService {
    /**
     * C-增
     * @param student
     */
    public void create(Student student);

    /**
     * R-单个查询
     *
     * @param id
     * @return
     */
    public Student retrieve(String id);

    /**
     * U-修改
     *
     * @param student
     */
    public void update(Student student);

    /**
     * D-删除
     *
     * @param id
     */
    public void delete(String id);

    /**
     * R-查找所有
     *
     * @return
     */
    public List<Student> findAll();
}
