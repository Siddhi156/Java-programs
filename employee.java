class employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

     public employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;

        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public static void main(String[] args) {
        employee emp = new employee("ABC", "XYZ", 40000);
        System.out.println(emp.getFirstName());
        System.out.println(emp.getLastName());
        System.out.println(emp.getMonthlySalary());
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
