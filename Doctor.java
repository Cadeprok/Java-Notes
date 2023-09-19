class Doctor extends HospitalEmployee {
    protected double doctorSalary;

    public Doctor(String name, int number, double salary) {
        super(name, number);
        doctorSalary = salary;
    }

    public void setSalary(double sal) {
        doctorSalary = sal;
    }

    public double getSalary() {
        return doctorSalary;
    }

    @Override
    public void work() {
        System.out.println(name + " is currently seeing a patient!");
    }

    @Override
    public String toString() { // make sure this works
        return name + "\n" + number + "\n" + "Doctor" + "\n" + doctorSalary;
    }
}
