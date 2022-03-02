class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ConstructorUses1 {
public static void main(String[] args) {

	Std std1=new Std(2,"srihari");
	Std std2=new Std(10,"software");
	std1.display();
	std2.display();
		}
}



