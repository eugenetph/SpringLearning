/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDemo;

/**
 *
 * @author Eugene Tan
 */
public class Address {
    private String country;
    private String zipCode;

    public Address() {
    }
    
    public Address(String country, String zipCode) {
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    
}
