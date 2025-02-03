package org.dnyanyog.service;  

import org.dnyanyog.common.DBUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public String getStud_Name(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Stud_Name FROM student WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Stud_Name");
            }
            return "No student found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }

    List<String> names = new ArrayList<>();

    public List<String> getStud_Email(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT * FROM student ");
            while (rs.next()) {
                names.add(rs.getString(1) + " " + rs.getString(3));
            }
            return names;
        } catch (SQLException e) {
            return names;
        }
    }

    public String getStud_Mob(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Stud_Mob FROM student WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Stud_Mob");
            }
            return "No student found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }
}
