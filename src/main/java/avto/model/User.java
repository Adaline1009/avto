package avto.model;

import lombok.Data;


import java.util.UUID;

/**
 * Created by Adelya on 12.08.2018.
 */
@Data
public class User {
    private UUID id;
    private String name;
    private String phone;
    private Role role;
}
