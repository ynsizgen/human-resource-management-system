package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.CvAbility;

public interface CvAbilityDao extends JpaRepository<CvAbility, Integer>{

}
