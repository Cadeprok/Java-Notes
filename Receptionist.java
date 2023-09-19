class Receptionist extends HospitalEmployee {
    protected double receptionistSalary;
    protected String receptionistPhoneNumer;

    public Receptionist(String name, int number, double salary, String phoneNumber) {
        super(name, number);
        receptionistPhoneNumer = phoneNumber;
        receptionistSalary = salary;
    }

    public double getSalary() {
        return receptionistSalary;
    }

    public void setSalary(double sal) {
        receptionistSalary = sal;
    }

    public void setPhoneNumber(String number) {
        receptionistPhoneNumer = number;
    }

    public String getPhoneNumer() {
        return receptionistPhoneNumer;
    }

    @Override
    public void work() {
        System.out.println(name + " is currently checking in patients");
    }

    @Override
    public String toString() { // make sure this works
        return name + "\n" + number + "\n" + "Administator" + "\n" + receptionistSalary + "\n Phone Number: "
                + receptionistPhoneNumer;
    }
}
