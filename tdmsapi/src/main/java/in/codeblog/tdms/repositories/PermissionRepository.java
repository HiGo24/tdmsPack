package in.codeblog.tdms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codeblog.tdms.domain.Permission;
@Repository

public interface PermissionRepository extends CrudRepository<Permission,Long>, JpaRepository<Permission, Long>{

	
	Permission findPermissionByModuleId(String ModuleId);
	
//	@Override
//	Iterable<Permission> findAll();
	
	
	@Query("from  Permission  where moduleId=?1 ")
	List <Permission> findByModuleId(String moduleId);

}

	
