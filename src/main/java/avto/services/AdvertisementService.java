package avto.services;

import avto.model.Advertisement;
import avto.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

/**
 * Created by Adelya on 09.09.2018.
 */

@Component
public class AdvertisementService {
    
    @Autowired
    private AdvertisementRepository advertisementRepository;

    public List<Advertisement> getAllAdvertisement() {
        return advertisementRepository.getAllAdvertisement();
    }

    public List<Advertisement> getAdvertisementByUserId(UUID id) {
        return advertisementRepository.getAdvertisementByUserId(id);
    }

    public List<Advertisement> findByFilter(Integer minYearValue,
                                            Integer maxYearValue,
                                            Integer minDistanceValue,
                                            Integer maxDistanceValue,
                                            Integer minPowerValue,
                                            Integer maxPowerValue,
                                            Integer minVolumeValue,
                                            Integer maxVolumeValue) {
        return advertisementRepository.findByFilter(minYearValue, maxYearValue, minDistanceValue, maxDistanceValue,
                minPowerValue, maxPowerValue, minVolumeValue, maxVolumeValue);
    }

    public void createAdvertisement(Advertisement advertisement) {
        UUID prId = UUID.randomUUID();
        advertisement.getParams().setId(prId);
        advertisement.setId(UUID.randomUUID());
        advertisementRepository.createAdvertisement(advertisement);
    }
}
