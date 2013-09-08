package simpledirectory

class Person {
	String name
	String email
	String password
	Date dateOfBirth
	String phone
	String address1
	String address2
	String city
	// TODO: Make state an enum
	String state
	String zip
	static hasMany = [jobs:Job]

    static constraints = {
		name blank: false, size: 0..150
		password password: true, blank: false, size: 8..255
		email email: true, blank: false, unique:true, size: 3..150
		// Minus 18 years
		dateOfBirth max: new Date().plus(-6574), blank: false, precision: "day"
		phone blank: false, size: 10..10
		address1 blank: false, size: 5..100
		address2 size: 5..100
		city blank: false, size: 2..50
		state blank: false, size: 2..2
		zip blank: false, size: 5..5
    }
}
