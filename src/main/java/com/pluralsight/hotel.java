package com.pluralsight;

public class hotel {
    public static void main(String[] args) {
        Room firstRoom = new Room(2,20.00, true, false);
        System.out.println(firstRoom.getPrice());
        Employee employee = new Employee(101, "John", "IT", 20.00, 0);

        employee.punchIn(9);
        employee.punchOut(17);

        System.out.println(employee.getHoursWorked());
    }
}
