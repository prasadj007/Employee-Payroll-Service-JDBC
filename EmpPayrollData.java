package com.bridgelabz.emppayrolljdbc.Emp_Payroll_JDBC;

import java.time.LocalDate;
import java.util.Objects;
public class EmpPayrollData {
        public int id;
        public String name;
        public double salary;
        public LocalDate start;

        public EmpPayrollData(int id, String name, double salary, LocalDate start) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.start = start;
   
}
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EmpPayrollData that = (EmpPayrollData) o;
            return id == that.id &&
                    Double.compare(that.salary, salary) == 0 &&
                    Objects.equals(name, that.name);
        }
    }
		
		

