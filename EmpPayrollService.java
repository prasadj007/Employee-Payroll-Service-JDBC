package com.bridgelabz.emppayrolljdbc.Emp_Payroll_JDBC;

import java.util.List;
public class EmpPayrollService {
	
	EmpPayrollDBService employeePayrollDBService = new EmpPayrollDBService();

	    public enum IOService{CONSOLE_IO, FILE_IO, DB_IO, REST_IO}

	    private List<EmpPayrollData> employeePayrollList;

	    public EmpPayrollService() {
	    }
	    public List<EmpPayrollData> readEmployeePayrollData(IOService ioService) {
	        if(ioService.equals(IOService.DB_IO))
	            this.employeePayrollList = employeePayrollDBService.readData();
	        return this.employeePayrollList;
	    }
	}

