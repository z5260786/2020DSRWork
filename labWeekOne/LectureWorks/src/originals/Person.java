package originals;

/**
 * a simple class that represents a person object, used later to test HashMap
 *
 * @author Saber Elsayed
 * @see TestingHashMap
 */
public class Person {

    /** name */
    private String name;
    /** mobile phone*/
    private String mobilePhone;
    /** address */
    private String address;

    /**
     * constructs a new person object based on data given
     *
     *
     * @param name name
     * @param mobilePhone mobile number
     * @param Address address
     */
    public Person(String name, String mobilePhone, String Address) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.address = Address;
    }
    /**
     * 
     * @return mobile phone number as a string
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    
    /**
     * return a string representation of a person object
     *
     * @return a string with the details of a a person object
     */
    @Override
    public String toString() {
        return "name=" + name + ", mobilePhone=" + mobilePhone
                + ", address=" + address;
    }

}
