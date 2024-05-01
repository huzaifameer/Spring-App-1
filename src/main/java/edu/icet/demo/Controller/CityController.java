package edu.icet.demo.Controller;

import edu.icet.demo.Service.CityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin
public class CityController {
    @GetMapping("/city/{postalCode}")
    public HashMap getCity(@PathVariable String postalCode){
        System.out.println("Postal code request received ....");
        System.out.println(postalCode);

        CityService cityService = new CityService();

        HashMap response = new HashMap();
        response.put("city",cityService.getCityByPostalCode(postalCode));

        return response;

    }
}