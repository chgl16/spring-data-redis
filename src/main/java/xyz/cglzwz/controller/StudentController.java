package xyz.cglzwz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import xyz.cglzwz.domain.Student;
import xyz.cglzwz.service.StudentService;

import java.util.List;

/**
 *
 * @author chgl16
 * @date 2019-01-26
 * @version 1.0
 */

@Controller
@RequestMapping("/")
public class StudentController {
    private final static Logger log = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    /**
     * 添加一个学生
     *
     * @param student
     */
    @RequestMapping("/create")
    public String create(Student student) {
        log.info("添加一个学生信息: " + student.toString());
        studentService.create(student);
        return "index";
    }

    /**
     * 检索所有学生信息
     *
     * @return
     */
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getAll() {
        log.info("获取所有学生");
        List<Student> students =  studentService.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("students", students);
        return mv;
    }

    /**
     * 测试
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
        log.info("测试");
    }
}
