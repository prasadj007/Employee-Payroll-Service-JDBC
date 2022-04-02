package com.bridgelabz.emppayrolljdbc.Emp_Payroll_JDBC;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpPayrollDBService {
	
    public List<EmpPayrollData> readData() {
        String sql = "SELECT * FROM employee_payroll2";
        List<EmpPayrollData> employeePayrollList = new ArrayList<>();

        try (Connection connection = this.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                double salary = result.getDouble("salary");
                LocalDate startDate = result.getDate("start").toLocalDate();
                employeePayrollList.add(new EmpPayrollData(id, name, salary, startDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeePayrollList;
    }
    private Connection getConnection() throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
        String userName = "root";
        String password = "#Yamahar4";
        Connection connection;
        System.out.println("Connecting to database: "+jdbcURL);
        connection = DriverManager.getConnection(jdbcURL, userName, password);
        System.out.println("Connection is successful! " +connection);
        return connection;
    }
}

