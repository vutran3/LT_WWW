package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
    private String mobile;
    private String gender;
    private String address;
    private String city;
    private String pinCode;
    private String state;
    private String country;
    private List<String> hobbies = new ArrayList<>();
    private String course;

    private List<Qualification> qualifications = new ArrayList<>();

    public Student() {}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public LocalDate getBirthday() { return birthday; }
    public void setBirthday(LocalDate birthday) { this.birthday = birthday; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getPinCode() { return pinCode; }
    public void setPinCode(String pinCode) { this.pinCode = pinCode; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public List<String> getHobbies() { return hobbies; }
    public void setHobbies(List<String> hobbies) { this.hobbies = hobbies != null ? hobbies : new ArrayList<>(); }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    public List<Qualification> getQualifications() { return qualifications; }
    public void setQualifications(List<Qualification> qualifications) { this.qualifications = qualifications != null ? qualifications : new ArrayList<>(); }

    // ===== Convenience for JSP <jsp:getProperty> =====
    public String getBirthdayStr() {
        return birthday != null ? birthday.toString() : "";
    }
    public String getHobbiesCsv() {
        return hobbies == null || hobbies.isEmpty() ? "" : String.join(", ", hobbies);
    }

    public void setHobbiesArray(String[] values) {
        this.hobbies = values != null ? Arrays.asList(values) : new ArrayList<>();
    }
}
