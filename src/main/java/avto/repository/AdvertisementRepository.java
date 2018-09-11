package avto.repository;

import avto.model.Advertisement;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.UUID;

/**
 * Created by Adelya on 12.08.2018.
 */
public interface AdvertisementRepository {
    List<Advertisement> getAllAdvertisement();

    List<Advertisement> getAdvertisementByUserId(@Param("id") UUID id);

    List<Advertisement> findByFilter(@Param(" minYearValue") Integer minYearValue,
                                     @Param(" maxYearValue") Integer maxYearValue,
                                     @Param(" minDistanceValue") Integer minDistanceValue,
                                     @Param(" maxDistanceValue") Integer maxDistanceValue,
                                     @Param(" minPowerValue") Integer minPowerValue,
                                     @Param(" maxPowerValue") Integer maxPowerValue,
                                     @Param(" minVolumeValue") Integer minVolumeValue,
                                     @Param(" maxVolumeValue") Integer maxVolumeValue);

    void createAdvertisement(@Param("adv") Advertisement advertisement);
}
