package file2669729;
import java.util.LinkedList;

public class Directory implements Component {
	private String name;
	private LinkedList<Component> children = new LinkedList<Component>();
	public Directory( String name ) {
		this.name = name;
	}
	// add a component into directory
	//   ignore null component
	public void add( Component c ) {
		if( c != null ) {
			children.add( c );
			if( c instanceof File ) {
				((File)c).setParent( this );
			}
		}
	}
	// remove a component from directory
	//   if the component is not inside this directory, do nothing
	public void remove( Component c ) {
		if( c != null ) {
			children.remove( c );
		}
	}
	// return this directory's name
	public String getName() {
		return name;
	}
	// return total file size within this directory
	public int getSize() {
		int size = 0;
		for( var i : children ) {
			size += i.getSize();
		}
		return size;
	}
	// return total file count within this directory
	public int getCount() {
		int count = 0;
		for( var i : children ) {
			count += i.getCount();
		}
		return count;
	}
	// display the structure under this directory
	public String display( String prefix ) {
		String ret = prefix + getName() + 
			String.format( ": (count=%d, size=%d)", getCount(), getSize() );
		for( var i : children ) {
			ret += ( "\n" + i.display( prefix + "\t" ) );
		}
		return ret;
	}
	// search a file and return the direct parent directory of it
	//   return null if the file is not under this directory
	public Component search( String name ) {
		Component c;
		for( var i : children ) {
			c = i.search( name );
			if( c != null ) return c;
		}
		return null;
	}
}
