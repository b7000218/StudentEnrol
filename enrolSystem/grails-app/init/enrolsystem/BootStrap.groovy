package com.enrol
class BootStrap {

    def init = { servletContext ->
def computing=new Course(
	department:'Computing',
	courseTitle:'BSc Hon Computing',
	courseLeader:'Dr Michelle Murphy',
	courseCode:'CS123',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	description:'Lorem ipsum etc etc',
	numberOfStudents: 55,
	tuitionFees:9000.60,
	studyMode:'Fulltime').save()

def pe=new Course(
	department:'Sports',
	courseTitle:'BSc PE',
	courseLeader:'Dr Big Dave',
	courseCode:'PE123',
	startDate:new Date('23/09/2019'),
	endDate:new Date('03/07/2023'),
	description:'Lorem ipsum etc etc',
	numberOfStudents: 60,
	tuitionFees:9250.00,
	studyMode:'Fulltime').save()

def english=new Course(
	department:'English',
	courseTitle:'BA English',
	courseLeader:'Dr Wordy Murphy',
	courseCode:'EN123',
	startDate:new Date('10/09/2019'),
	endDate:new Date('01/06/2023'),
	description:'Lorem ipsum etc etc',
	numberOfStudents: 57,
	tuitionFees:9000.00,
	studyMode:'Fulltime').save()

def bigdave=new Lecturer(
	fullName:'Big Dave',
	post:'DR',
	subject:'Red Cards',
	lecturerEmail:'SentOffEVerySingleGame@gmail.com',
	office:'Does not have one',
	bio:'Top feller').save()

def bryn=new Lecturer(
	fullName:'Bryn Bowler',
	post:'Sir',
	subject:'Life',
	lecturerEmail:'brynnyboi123124@gmail.com',
	office:'All of them',
	bio:'Could sell sand to a man in the desert').save()

def ed=new Lecturer(
	fullName:'Ed Bee',
	post:'Geez',
	subject:'Milwall',
	lecturerEmail:'eddybeeeeeee1291@gmail.com',
	office:'The Den',
	bio:'Long time season ticket holder at Milwall').save()

def sysarchs=new Module(
	module_title:'System Architectures',
	module_code:'SA123',
	credits:40,
	lecturer:'Bryn Bowler',
	course:'BSc Computing',
	description:'Sometimes things break, sometimes they do not').save()

def wadi=new Module(
	module_title:'Web App Design and Implementation',
	module_code:'WA123',
	credits:40,
	lecturer:'Dave',
	course:'BSc Computing',
	description:'Sometimes things work, sometimes they do not').save()

def joeg=new Student(
	studentName:'Joe Glover',
	studentID:'B7000218',
	dob:new Date('04/01/1999'),
	isFundingAvailable:true,
	studentEmail:'b7000218@shu.com',
	studentUsername:'joethekangaroo',
	studentPassword:'brynisick',
	course: 'BSc Computing').save()

def brynb=new Student(
	studentName:'Bryn Bowler',
	studentID:'B7013157',
	dob:new Date('08/01/1999'),
	isFundingAvailable:true,
	studentEmail:'b7013157@shu.com',
	studentUsername:'brynthewallaby',
	studentPassword:'coolio',
	course: 'BSc Computing').save()
    }
    def destroy = {
    }
}
