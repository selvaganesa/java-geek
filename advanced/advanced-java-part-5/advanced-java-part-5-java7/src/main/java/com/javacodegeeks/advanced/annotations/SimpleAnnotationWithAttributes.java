package com.javacodegeeks.advanced.annotations;

public @interface SimpleAnnotationWithAttributes {
    String name();
    int order() default 0;
}
