package avto.services;

import avto.model.Model;
import avto.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

/**
 * Created by Adelya on 09.09.2018.
 */
@Component
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;
    List<Model> getAllModelsForCarMark(UUID carMarkId){
        return modelRepository.getAllModelsForCarMark(carMarkId);
    }
}
