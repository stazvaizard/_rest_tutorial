package org.software.iris.rest.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Especies {
	@Id
	public ObjectId _id;

	public String category;
	public double sl;
	public double sw;
	public double pl;
	public double pw;


	// Constructors
	public Especies() {
	}

	public Especies(ObjectId _id, double sl, double sw, double pl, double pw) {
		this._id = _id;
		this.sl = sl;
		this.sw = sw;
		this.pl = pl;
		this.pw = pw;
	}

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public double getSl() {
		return sl;
	}

	public void setSl(double sl) {
		this.sl = sl;
	}

	public double getSw() {
		return sw;
	}

	public void setSw(double sw) {
		this.sw = sw;
	}

	public double getPl() {
		return pl;
	}

	public void setPl(double pl) {
		this.pl = pl;
	}
	public double getPw() {
		return pw;
	}

	public void setPw(double pw) {
		this.pw = pw;
	}
	
}
