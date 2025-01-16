package com.qingmingxin.anno;

import com.auth0.jwt.interfaces.Payload;
import com.qingmingxin.validation.FileTypeValidation;
import jakarta.validation.Constraint;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {FileTypeValidation.class })
@Target({FIELD})
@Retention(RUNTIME)
public @interface FileType {
    String message() default "type参数的值只能是file或者dir";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
