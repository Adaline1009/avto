package avto.model;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Adelya on 12.08.2018.
 */

@Data
public class Advertisement {
    private UUID id;
    private String type;
    private String title;
    private String description;
    private Double longitude;
    private Double latitude;
    private Double price;
    private Date startDate;
    private Boolean isActive;
    private String city;
    private User seller;
    private AvtoParams params;
}
