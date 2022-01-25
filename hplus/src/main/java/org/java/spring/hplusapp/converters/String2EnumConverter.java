package org.java.spring.hplusapp.converters;

import org.java.spring.hplusapp.beans.Gender;
import org.springframework.core.convert.converter.Converter;

public class String2EnumConverter implements Converter<String, Gender> {
    @Override
    public Gender convert(String source) {
        if("Male".equals(source)){
            return Gender.MALE;
        } else if("Female".equalsIgnoreCase(source)) {
            return Gender.FEMALE;
        } else
            return Gender.OTHER;
    }
}
