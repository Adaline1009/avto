package avto.repository;

import avto.model.AvtoParams;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.UUID;

/**
 * Created by Adelya on 12.08.2018.
 */
public interface AutoParamsRepository {
    AvtoParams getAvtoParamsById(@Param("id")UUID id);
    void addAvtoParams(@Param("avtoParams") AvtoParams avtoParams);
    void updateAvtoParams(@Param("avtoParams") AvtoParams avtoParams);
    void deleteAvtoParams(@Param("id")UUID id);
}
