package simpledirectory

class Job {
	String name
	// TODO: Access control
	
	String toString() { name }
	
    static constraints = {
		name blank: false, size: 5..100
    }
}
