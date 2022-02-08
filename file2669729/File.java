package file2669729;

public class File implements Component {
	private String name;
	private int size;
	private Component parent = null;
	public File( String name, int size ) {
		this.name = name;
		this.size = size;
	}
	// return this file's name
	public String getName() {
		return name;
	}
	// return this file's size
	public int getSize() {
		return size;
	}
	// return this file count: 1
	public int getCount() {
		return 1;
	}
	// return String that describes this file
	public String display(String prefix) {
		return getName() + String.format( " (%d)", getSize() );
	}
	// if this is the file we are searching for, return its parent
	public Component search(String name) {
		return ( this.name.equals( name ) ) ? parent : null;
	}
	// set parent of this file
	public void setParent( Component p ) {
		this.parent = p;
	}
}
