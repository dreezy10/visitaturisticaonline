package com.guinevisita.guinevisitaturisticabackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Photo_Hotel")
@Table(name = "photo")
public class Photo_Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String photo_name;
	private String _1_photo;
	private String _2_photo;
	private String _3_photo;
	private String _4_photo;
	private String _5_photo;
	private String _6_photo;
	private String _7_photo;
	private String _8_photo;
	private String _9_photo;
	private String _10_photo;
	
	
	public Photo_Hotel () {
			
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	


	public String getPhoto_name() {
		return photo_name;
	}


	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}


	public String get_1_photo() {
		return _1_photo;
	}


	public void set_1_photo(String _1_photo) {
		this._1_photo = _1_photo;
	}


	public String get_2_photo() {
		return _2_photo;
	}


	public void set_2_photo(String _2_photo) {
		this._2_photo = _2_photo;
	}


	public String get_3_photo() {
		return _3_photo;
	}


	public void set_3_photo(String _3_photo) {
		this._3_photo = _3_photo;
	}


	public String get_4_photo() {
		return _4_photo;
	}


	public void set_4_photo(String _4_photo) {
		this._4_photo = _4_photo;
	}


	public String get_5_photo() {
		return _5_photo;
	}


	public void set_5_photo(String _5_photo) {
		this._5_photo = _5_photo;
	}


	public String get_6_photo() {
		return _6_photo;
	}


	public void set_6_photo(String _6_photo) {
		this._6_photo = _6_photo;
	}


	public String get_7_photo() {
		return _7_photo;
	}


	public void set_7_photo(String _7_photo) {
		this._7_photo = _7_photo;
	}


	public String get_8_photo() {
		return _8_photo;
	}


	public void set_8_photo(String _8_photo) {
		this._8_photo = _8_photo;
	}


	public String get_9_photo() {
		return _9_photo;
	}


	public void set_9_photo(String _9_photo) {
		this._9_photo = _9_photo;
	}


	public String get_10_photo() {
		return _10_photo;
	}


	public void set_10_photo(String _10_photo) {
		this._10_photo = _10_photo;
	}
	
	

}
