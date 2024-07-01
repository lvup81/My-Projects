package com.punith.SpringJDBC.Repo;

import com.punith.SpringJDBC.mode.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepo {

    public JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql = "insert into student (roll,name,id) values(?,?,?)";
        int rows=jdbc.update(sql,s.getRoll(),s.getName(),s.getId());
        System.out.println(rows);
    }

    public List<Student> findAll() {
       String sql = "select * from student";
        return jdbc.query(sql,(rs, rowNum) -> {
            Student s = new Student();
            s.setRoll(rs.getInt("roll"));
            s.setName(rs.getString("name"));
            s.setId(rs.getInt("id"));
            return s;
        });
    }
}
