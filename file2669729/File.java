package file2669729;

public class File implements Component {
	private String name;
	private int size;
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
		return prefix + getName() + String.format( " (%d)", getSize() );
	}
	// search function can only return Directory object
	public Component search(String name) {
		return null;
	}
}
