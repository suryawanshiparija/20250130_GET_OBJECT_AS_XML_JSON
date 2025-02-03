package org.dnyanyog.service;  

import org.dnyanyog.common.DBUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    public String getTeach_Name(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Teach_name FROM teacher WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Teach_name");
            }
            return "No teacher found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }

    List<String> names = new ArrayList<>();

    public List<String> getTeach_Email(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT * FROM teacher ");
            while (rs.next()) {
                names.add(rs.getString(1) + " " + rs.getString(3));
            }
            return names;
        } catch (SQLException e) {
            return names;
        }
    }

    public String getTeach_Mob(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Teach_mob FROM teacher WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Teach_mob");
            }
            return "No teacher found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }
}
