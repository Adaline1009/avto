package avto.controllers;

import avto.model.Advertisement;
import avto.model.FilterParams;
import avto.model.User;
import avto.services.AdvertisementService;
import avto.services.UserServices;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by Adelya on 09.09.2018.
 */
@RestController
@RequestMapping("${rest.prefix}/advertisements")
@Api(value = "usersController", description = "Operations with employee")
public class AdvertisementController {
    @Autowired
    private AdvertisementService advertisementService;

    @PostMapping(value = "/all")
    public List<Advertisement> getAllAdvertisement() {
        return advertisementService.getAllAdvertisement();
    }
    @PostMapping(value = "/{id}")
    public List<Advertisement> getAdvertisementByUserId(@PathVariable String id) {
        return advertisementService.getAdvertisementByUserId(UUID.fromString(id));
    }

    @PostMapping(value = "/filter")
    public List<Advertisement> getAdvertisementByFilter(@RequestBody FilterParams filterParams) {
        return advertisementService.findByFilter(filterParams.getMinYearValue(), filterParams.getMaxYearValue(),
                filterParams.getMinDistanceValue(), filterParams.getMaxDistanceValue(),
                filterParams.getMinPowerValue(), filterParams.getMaxPowerValue(),
                filterParams.getMinVolumeValue(), filterParams.getMaxVolumeValue());
    }

    @PostMapping(value = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createAdvertisements(@RequestBody Advertisement advertisement) {
        advertisementService.createAdvertisement(advertisement);
    }
}



