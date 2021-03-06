package com.tracebucket.x1.dictionary.api.domain.jpa.impl;

import com.tracebucket.tron.ddd.domain.BaseValueObject;
import com.tracebucket.x1.dictionary.api.domain.Address;
import com.tracebucket.x1.dictionary.api.domain.AddressType;
import com.tracebucket.x1.dictionary.api.domain.enums.converter.AddressTypeConverter;

import javax.persistence.*;

@Embeddable
public class DefaultAddress extends BaseValueObject implements Address {

    @Column(name = "NAME")
    @Basic(fetch = FetchType.EAGER)
    private String name;

    @Column(name = "BUILDING", length = 75)
    @Basic(fetch = FetchType.EAGER)
    private String building;

    @Column(name = "STREET", length = 100)
    @Basic(fetch = FetchType.EAGER)
    private String street;

    @Column(name = "REGION", length = 75)
    @Basic(fetch = FetchType.EAGER)
    private String region;

    @Column(name = "CITY", nullable = false, length = 75)
    @Basic(fetch = FetchType.EAGER)
    private String city;

    @Column(name = "DISTRICT", length = 75)
    @Basic(fetch = FetchType.EAGER)
    private String district;

    @Column(name = "STATE", nullable = false, length = 75)
    @Basic(fetch = FetchType.EAGER)
    private String state;

    @Column(name = "COUNTRY", nullable = false, length = 50)
    @Basic(fetch = FetchType.EAGER)
    private String country;

    @Column(name = "ZIP", nullable = false, length = 20)
    @Basic(fetch = FetchType.EAGER)
    private String zip;

    @Column(name = "ADDRESS_TYPE")
    @Convert(converter = AddressTypeConverter.class)
    private AddressType addressType;

    @Column(name = "DEFAULT_ADDRESS", nullable = false, columnDefinition = "boolean default true")
    @Basic(fetch = FetchType.EAGER)
    private boolean defaultAddress;

    public DefaultAddress() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public boolean isDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(boolean defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultAddress)) return false;
        if (!super.equals(o)) return false;

        DefaultAddress address = (DefaultAddress) o;

        if (building != null ? !building.equals(address.building) : address.building != null) return false;
        if (!city.equals(address.city)) return false;
        if (!country.equals(address.country)) return false;
        if (!district.equals(address.district)) return false;
        if (name != null ? !name.equals(address.name) : address.name != null) return false;
        if (region != null ? !region.equals(address.region) : address.region != null) return false;
        if (!state.equals(address.state)) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (!zip.equals(address.zip)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (building != null ? building.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        return result;
    }
}
