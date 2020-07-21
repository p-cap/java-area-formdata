package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;

import static java.lang.Math.PI;

@RestController //always start with this
@RequestMapping("/math")
public class TestParams {
    //URL: http://localhost:8080/math/area
    @PostMapping("/area")
    public String getArea(
            @RequestParam(value = "type") String type,
            @RequestParam(value = "radius", required = false) double radius
//            @RequestParam(value = "width", required = false) int width,
//            @RequestParam(value = "length", required = false) int length
    ) {
        String result = "null";

        if (Objects.equals(type, "circle")) {
            double areaOfCircle = PI + Math.pow(radius, 2.00);
            result = "The area is " + areaOfCircle;
//        }
//        } else if (type.equals("rectangle")) {
//            String areaOfRectangle = "The area is " + (width * length);
//            result = areaOfRectangle;
//        } else { result = "Invalid entry"; }


        }
        return result;
    }
}

