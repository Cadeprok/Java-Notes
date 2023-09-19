class Admin extends HospitalEmployee {
    protected double adminSalary;

    public Admin(String name, int number, double salary) {
        super(name, number);
        adminSalary = salary;
    }

    public void setSalary(double sal) {
        adminSalary = sal;
    }

    public double getSalary() {
        return adminSalary;
    }

    @Override
    public void work() {
        System.out.println(name + " is currently editing spreadsheets");
    }

    @Override
    public String toString() { // make sure this works
        return name + "\n" + number + "\n" + "Administator" + "\n" + adminSalary;
    }
}
