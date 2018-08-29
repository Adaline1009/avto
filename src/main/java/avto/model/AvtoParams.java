package avto.model;

import lombok.Data;

import java.util.UUID;

/**
 * Created by Adelya on 12.08.2018.
 */
@Data
public class AvtoParams {
    private UUID id;
    private Mark mark;
    private Model model;
    private Integer year;
    private Double distance;
    private Integer power;
    private Double engineVolume;
    private String transmission;
    private String engineType;
}
