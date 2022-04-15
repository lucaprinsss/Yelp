package it.polito.tdp.Yelp.model;

import java.util.List;

import it.polito.tdp.Yelp.db.YelpDAO;

public class Model {
	
	private List<Business> businesses = null ;

	public List<Business> getBusinesses() {
		if(this.businesses == null) {
			YelpDAO dao = new YelpDAO() ;
			this.businesses = dao.readAllBusinesses() ;
		}
		return this.businesses ;
	}
}