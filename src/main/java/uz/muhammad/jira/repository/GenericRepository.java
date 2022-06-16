package uz.muhammad.jira.repository;

import uz.muhammad.jira.criteria.GenericCriteria;
import uz.muhammad.jira.domains.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/14:53 (Tuesday)
 * jira/IntelliJ IDEA
 */

/**
 * @param <E> -> The POJO class that refer to db Table
 * @param <C> -> Criteria for filtering on query
 * @param <ID> -> Id for entity
 */
public interface GenericRepository<
        E extends BaseEntity,
        C extends GenericCriteria,
        ID extends Serializable> extends Repository {

    /**
     *
     * @param id entity id
     * @return Optional of Entity
     */
    Optional<E> findById(ID id);

    Optional<List<E>> findAll(C criteria);
}
