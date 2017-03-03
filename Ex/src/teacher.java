
public class teacher {
	private String name,id;
	private char gender;
	private double height,weigth;
	public void teacher(String name1,String id1){
		name = name1;
		id = id1;
		System.out.println(name1+","+id1);
	}
	public void setheight(double height1,double weigth1){
		height=weigth1;
		weigth=weigth1;
		System.out.println("身高:"+height1+","+"體重:"+weigth1);
	}
	public String getname(){
		return name;
	}
	public String getid(){
		return id;
	}
	public char gender(){
		return gender;
	}
}
