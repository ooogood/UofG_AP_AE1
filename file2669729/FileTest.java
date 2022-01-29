package file2669729;

public class FileTest {
	public static void main(String[] args) {
		// // test 1
		// File courseworkpdf = new File("courseworkpdf",1);
		// File courseworkzip = new File("coursework zip file",2);

		// Directory coursework = new Directory("coursework");
		// coursework.add(courseworkpdf);
		// coursework.add(courseworkzip);

		// Directory unittests = new Directory("unit tests");
		// File test1 = new File("unit test 1",56);
		// unittests.add(test1);

		// coursework.add(unittests);
		// coursework.remove(courseworkzip);
		// System.out.println(coursework.display(""));

		// System.out.println( coursework.search("unit test 1").getName() );

		// test 2
		Directory classical = new Directory("classical");
		Directory jazz = new Directory("jazz");
		Directory music = new Directory("music");
		Directory pictures = new Directory("pictures");
		Directory root = new Directory("root");
		File Settings = new File("Settings", 10);
		File portrait = new File("portrait", 120);
		File KindofBlue = new File("Kind of Blue", 201);
		File GiantSteps = new File("Giant Steps", 134);
		File BeethovenSymphonyno6 = new File("Beethoven, Symphony no 6", 421);
		
		File randomMusic = new File("Take Five", 1234);
		File randomPic = new File("random picture", 2345);
		Directory randomDir = new Directory("random directory");
		File randomFile = new File("random file", 1);
		
		classical.add(BeethovenSymphonyno6);
		jazz.add(KindofBlue);
		jazz.add(GiantSteps);
		music.add(jazz);
		music.add(classical);
		music.add(randomMusic);
		pictures.add(portrait);
		pictures.add(randomPic);
		root.add(Settings);
		root.add(pictures);
		root.add(music);
		randomDir.add(randomFile);
		root.add(randomDir);
		System.out.println( root.display("") );
		System.out.println( "=========================" );

		music.remove(randomMusic);
		pictures.remove(randomPic);
		root.remove(randomDir);
		System.out.println( root.display("") );
		System.out.println( "=========================" );

		root.remove(portrait);
		root.remove(GiantSteps);
		root.remove(randomDir);
		System.out.println( root.display("") );
		System.out.println( "=========================" );

		Component tmp;
		tmp = root.search("Giant Steps");
		System.out.println( tmp == null ? "null" : tmp.getName() );
		tmp = root.search("pictures");
		System.out.println( tmp == null ? "null" : tmp.getName() );
		tmp = root.search("portrait");
		System.out.println( tmp == null ? "null" : tmp.getName() );
		tmp = root.search("Take Five");
		System.out.println( tmp == null ? "null" : tmp.getName() );
		tmp = root.search("gIaNt StEpS");
		System.out.println( tmp == null ? "null" : tmp.getName() );
		System.out.println( "=========================" );

		// test 3
		Directory t1 = new Directory("t1");
		System.out.println( t1.display("") );
		System.out.println( "=========================" );
		Directory t2 = new Directory("t2");
		t1.add( t2 );
		Directory t3 = new Directory("t3");
		t2.add( t3 );
		Directory t4 = new Directory("t4");
		t3.add( t4 );
		Directory t5 = new Directory("t5");
		t4.add( t5 );
		System.out.println( t1.display("") );
		System.out.println( "=========================" );
	}
}