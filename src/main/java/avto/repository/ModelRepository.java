package avto.repository;

import avto.model.Model;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.UUID;

/**
 * Created by Adelya on 12.08.2018.
 */
public interface ModelRepository {
    List<Model> getAllModelsForCarMark(@Param("carMarkId") UUID carMarkId);
}
