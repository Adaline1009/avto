package avto.services;

import avto.model.Mark;
import avto.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Adelya on 09.09.2018.
 */
@Component
public class MarkService {
    @Autowired
    private MarkRepository markRepository;
    List<Mark> getAllCarsMarks(){
        return markRepository.getAllCarsMarks();
    }
}
