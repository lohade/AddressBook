public class PersonInfo {
    private String name;
    private String address;
    private String email;
    private String city;
    private int zip;
    private String state;
    private String phone;

    public PersonInfo(String name,String address,String email,String city,String state,int zip,String phone){
        this.address=address;
        this.city=city;
        this.email=email;
        this.name=name;
        this.state=state;
        this.zip=zip;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
