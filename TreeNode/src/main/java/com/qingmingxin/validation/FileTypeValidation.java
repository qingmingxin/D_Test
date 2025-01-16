package com.qingmingxin.validation;

import com.qingmingxin.anno.FileType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FileTypeValidation implements ConstraintValidator<FileType, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
       if(s==null) {
           return false;
       }
       if(s.equals("file") || s.equals("dir")) {
           return true;
       }
       return false;
    }
}
