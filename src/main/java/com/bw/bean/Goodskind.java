package com.bw.bean;

public class Goodskind {
	private Integer kid;
	private String kname;
	public Goodskind() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodskind(Integer kid, String kname) {
		super();
		this.kid = kid;
		this.kname = kname;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	@Override
	public String toString() {
		return "Goodskind [kid=" + kid + ", kname=" + kname + "]";
	}
	
}
