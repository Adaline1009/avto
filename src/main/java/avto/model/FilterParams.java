package avto.model;

import lombok.Data;

/**
 * Created by Adelya on 09.09.2018.
 */
@Data
public class FilterParams {
    private Integer minYearValue;
    private Integer maxYearValue;
    private Integer minDistanceValue;
    private Integer maxDistanceValue;
    private Integer minPowerValue;
    private Integer maxPowerValue;
    private Integer minVolumeValue;
    private Integer maxVolumeValue;
}
