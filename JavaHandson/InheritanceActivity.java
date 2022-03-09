package com.java.in;

import static org.junit.Assert.*;

import org.junit.Test;




import com.java.in.Employee.Manager;
import com.java.in.Employee.Manager.Trainee;


public class InheritanceActivity {
Manager m=new Manager(126534l,"Peter","Chennai India",2378441l,65000d);

@Test
public void testcalculateSalary()
{
assertEquals(540585,m.calculateSalary(),10^1);
}

Trainee t=new Trainee(29846l,"Jack","Mumbai India",442085l,45000d);
@Test
public void testcalculateSalary1()
{
assertEquals(540585,t.calculateSalary(),10^1);
}
}