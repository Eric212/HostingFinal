package com.sospedra.hosting.respositorios;

import com.sospedra.hosting.entidades.WebEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository extends JpaRepository<WebEntity,Long> {

    @Query("select w.url from WebEntity w where w.id =?1")
    public String findWebUrl(Long id);
    @Query("select w.active from WebEntity w where w.id =?1")
    public Boolean findWebActive(Long id);
    @Query("select w from WebEntity w where w.id = ?1")
    public WebEntity findWebByDomain(Long id);

}
