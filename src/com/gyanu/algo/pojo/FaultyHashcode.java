package com.gyanu.algo.pojo;

public class FaultyHashcode {
	private String name;
	private String phone;

	public FaultyHashcode(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return prime;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaultyHashcode other = (FaultyHashcode) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FaultyHashcode [name=" + name + ", phone=" + phone + "]";
	}

}
