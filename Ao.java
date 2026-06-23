class Student {
	int rollno;
	String name;
	int marks;
}

class Ao {
	public static void main(String []args){
		int nums [] = new int [4];

		Student s1 = new Student();
		s1.rollno = 24;
		s1.name = "praveen";
		s1.marks = 88;

		Student s2 = new Student();
		s2.rollno = 25;
		s2.name = "jai";
		s2.marks = 89;

		Student s3 = new Student();
		s3.rollno = 26;
		s3.name = "raj";
		s3.marks = 90;

		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for(int i=0;i<nums.length;i++){
			System.out.println(students[i].name +" : "+ students[i].marks);
		}

		/*nums [0] = 4;
		nums [1] = 5;
		nums [2] = 6;

		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}*/
		
		

	}
}