package it.polito.tdp.Yelp.db;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.Yelp.model.Business;

public class TestDAO {

	public static void main(String[] args) {
		YelpDAO dao = new YelpDAO();
		List<Business> businesses = dao.readAllBusinesses();
		System.out.println(businesses.size());

		long startTime = System.nanoTime();
		List<Double> allStars = new ArrayList<>();
		for (Business b : businesses) {
			double stars = dao.averageStars(b);
			allStars.add(stars);
		}
		long endTime = System.nanoTime();
		System.out.println("Calcolate " + allStars.size() + " stelle in " + (endTime - startTime) / 1000000 + " ms");

	}

}