package esTanFacil.backend.repositories;

import esTanFacil.backend.model.CNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INews extends JpaRepository <CNews, Long> {
}
