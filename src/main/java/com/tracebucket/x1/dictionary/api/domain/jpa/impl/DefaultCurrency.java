package com.tracebucket.x1.dictionary.api.domain.jpa.impl;

import com.tracebucket.tron.ddd.domain.BaseValueObject;
import com.tracebucket.x1.dictionary.api.domain.Currency;
import com.tracebucket.x1.dictionary.api.domain.CurrencyType;
import com.tracebucket.x1.dictionary.api.domain.enums.converter.CurrencyTypeConverter;

import javax.persistence.*;

/**
 * Created by ffl on 20-11-2014.
 */
@Embeddable
public class DefaultCurrency extends BaseValueObject implements Currency{

    @Column(name = "NAME", nullable = false, length = 200)
    @Basic(fetch = FetchType.EAGER)
    private String name;

    @Column(name = "ISO_4217_CODE", length = 100)
    @Basic(fetch = FetchType.EAGER)
    private String iso4217Code;

    @Column(name = "SUB_UNIT_1_10", length = 100)
    @Basic(fetch = FetchType.EAGER)
    private String subUnit110;

    @Column(name = "IMAGE", length = 200)
    @Basic(fetch = FetchType.EAGER)
    private String image;

    @Column(name = "EMAIL_TYPE")
    @Convert(converter = CurrencyTypeConverter.class)
    private CurrencyType currencyType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso4217Code() {
        return iso4217Code;
    }

    public void setIso4217Code(String iso4217Code) {
        this.iso4217Code = iso4217Code;
    }

    public String getSubUnit110() {
        return subUnit110;
    }

    public void setSubUnit110(String subUnit110) {
        this.subUnit110 = subUnit110;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultCurrency)) return false;

        DefaultCurrency currency = (DefaultCurrency) o;

        if (image != null ? !image.equals(currency.image) : currency.image != null) return false;
        if (iso4217Code != null ? !iso4217Code.equals(currency.iso4217Code) : currency.iso4217Code != null)
            return false;
        if (name != null ? !name.equals(currency.name) : currency.name != null) return false;
        if (subUnit110 != null ? !subUnit110.equals(currency.subUnit110) : currency.subUnit110 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (iso4217Code != null ? iso4217Code.hashCode() : 0);
        result = 31 * result + (subUnit110 != null ? subUnit110.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}
