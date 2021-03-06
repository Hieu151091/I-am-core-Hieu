package fr.epita.iam.services;

import java.util.List;

import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.exceptions.DaoDeleteException;
import fr.epita.iam.exceptions.DaoSaveException;
import fr.epita.iam.exceptions.DaoSearchException;
import fr.epita.iam.exceptions.DaoUpdateException;
/**
 * this is interfaceS
 * @author Ngoc Hieu
 *
 */ 
	
	public interface IdentityDAO {

		public void insert(Identity identity) throws DaoSaveException;
		
		public void update(Identity identity) throws DaoUpdateException; 
		public void delete(Identity identity) throws DaoDeleteException;
		public List<Identity> search(Identity criteria) throws DaoSearchException;
		
		public void releaseResources();
		

}
