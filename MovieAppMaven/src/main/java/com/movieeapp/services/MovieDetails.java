package com.movieeapp.services;

import java.util.ArrayList;
import java.util.List;

public class MovieDetails {
	
	public List<String> showMovies(String language){
		List<String> movies = new ArrayList<String>();
		if(language.equals("Telugu")) {
			movies.add("RRR");
			movies.add("joe");
			movies.add("kalki");
			movies.add("hi");
		}
		if(language.equals("Kannada")) {
			movies.add("Anna");
			movies.add("Aaa");
			movies.add("NNN");
			movies.add("Jeeva");
		}
		if(language.equals("Marati")) {
			movies.add("SAS");
			movies.add("cat");
			movies.add("Zoe");
			movies.add("owl");
		}
		if(language.equals("Tamil")) {
			movies.add("kkk");
			movies.add("Das");
			movies.add("kaal");
			movies.add("Slide");
		}
		if(language.equals("Hindi")) {
			movies.add("Sasi");
			movies.add("Quer");
			movies.add("eega");
			movies.add("jii");
		}
		return movies;
		
		
		
		
		
	}

}
