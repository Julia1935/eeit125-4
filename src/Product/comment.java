package Product;

import java.util.Date;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class comment {
	
//	private List <Member> consumer;
	private String name;
	private String gender;
	private int age;
	private int status;
	private Date comment_time;
	private String content_box;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getComment_time() {
		return comment_time;
	}
	public void setComment_time(Date comment_time) {
		this.comment_time = comment_time;
	}
	public String getContent_box() {
		return content_box;
	}
	public void setContent_box(String content_box) {
		this.content_box = content_box;
	}

	
	

}
