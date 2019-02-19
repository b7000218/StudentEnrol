package com.enrol
class BootStrap {

    def init = { servletContext ->
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

def derek=new Lecturer(
	fullName:'Derek B',
	post:'Geezer',
	subject:'Computers',
	lecturerEmail:'derekkbeeeeeee1291@gmail.com',
	office:'The Den',
	bio:'Long time season ticket holder at Rotherham').save()

def jane=new Lecturer(
	fullName:'Jane M',
	post:'Dr',
	subject:'Lexicon',
	lecturerEmail:'janeyyyyy1291@gmail.com',
	office:'Cantor 9501',
	bio:'Long time season ticket holder at Ya Da').save()

def conor=new Lecturer(
	fullName:'Conor McGregor',
	post:'Mr',
	subject:'MMA',
	lecturerEmail:'champchamp20151291@gmail.com',
	office:'SBG Ireland',
	bio:'First ever UFC double champion').save()

def computing=new Course(
	department:'Computing',
	courseTitle:'BSc Hon Computing',
	courseLeader:ed,
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
	courseLeader:conor,
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
	courseLeader:jane,
	courseCode:'EN123',
	startDate:new Date('10/09/2019'),
	endDate:new Date('01/06/2023'),
	description:'Lorem ipsum etc etc',
	numberOfStudents: 57,
	tuitionFees:9000.00,
	studyMode:'Fulltime').save()

def sysarchs=new Module(
	module_title:'System Architectures',
	module_code:'SA123',
	credits:40,
	lecturer:'Ed Bee',
	course:'BSc Computing',
	description:'Sometimes things break, sometimes they do not, also somehow links to PE.').save()

def wadi=new Module(
	module_title:'Web App Design and Implementation',
	module_code:'WA123',
	credits:40,
	lecturer:'Ed Bee',
	course:'BSc Computing',
	description:'Sometimes things work, sometimes they do not, also somehow links to English.').save()

def sportpsy=new Module(
	module_title:'Sport Psychology',
	module_code:'SP123',
	credits:60,
	lecturer:'Big Dave',
	course:'BSc PE',
	description:'Sports and the mind').save()

def dba=new Module(
	module_title:'Database Administration and Data Sources',
	module_code:'DB123',
	credits:40,
	lecturer:'Lynn',
	course:'BSc Computing',
	description:'SQL Server and stuff').save()

def poems=new Module(
	module_title:'Poems and that',
	module_code:'PO123',
	credits:30,
	lecturer:'Jane',
	course:'BA English',
	description:'To be or not to be').save()

def joeg=new Student(
	studentName:'Joe Glover',
	studentID:'B7000218',
	dob:new Date('04/01/1999'),
	isFundingAvailable:true,
	studentEmail:'b7000218@shu.com',
	studentUsername:'joethekangaroo',
	studentPassword:'brynisick',
	course:computing).save()

def dave=new Student(
	studentName:'Dave Jordan',
	studentID:'B7010101',
	dob:new Date('01/04/1999'),
	isFundingAvailable:true,
	studentEmail:'b7010101@shu.com',
	studentUsername:'davethestriker',
	studentPassword:'redcard',
	course:pe).save()

def brynb=new Student(
	studentName:'Bryn Bowler',
	studentID:'B7013157',
	dob:new Date('08/01/1999'),
	isFundingAvailable:true,
	studentEmail:'b7013157@shu.com',
	studentUsername:'brynthewallaby',
	studentPassword:'coolio',
	course:english).save()

def jonny=new Student(
	studentName:'Jonny G',
	studentID:'B7037157',
	dob:new Date('10/01/1999'),
	isFundingAvailable:true,
	studentEmail:'b7037157@shu.com',
	studentUsername:'jonnythelad',
	studentPassword:'avon',
	course:english).save()

def belinda=new Student(
	studentName:'Belinda Smith',
	studentID:'B7013156',
	dob:new Date('08/02/1999'),
	isFundingAvailable:true,
	studentEmail:'b7013156@shu.com',
	studentUsername:'belindatheenglishstudent',
	studentPassword:'words',
	course:english).save()

def alan=new Student(
	studentName:'Athletic AL',
	studentID:'B7013155',
	dob:new Date('08/07/1999'),
	isFundingAvailable:true,
	studentEmail:'b7013155@shu.com',
	studentUsername:'brynthesportsman',
	studentPassword:'balls',
	course:english).save()

def henry=new Student(
	studentName:'Thierry Henry',
	studentID:'B7013154',
	dob:new Date('08/01/1998'),
	isFundingAvailable:true,
	studentEmail:'b7013154@shu.com',
	studentUsername:'henrytheinvincible',
	studentPassword:'arsenal',
	course:english).save()

ed.addToModules(sysarchs)
ed.addToModules(wadi)
bigdave.addToModules(sportpsy)
jane.addToModules(poems)
computing.addToLecturers(derek)
computing.addToLecturers(ed)
english.addToLecturers(bryn)
english.addToLecturers(jane)
pe.addToLecturers(conor)
pe.addToLecturers(bigdave)
ed.addToCourses(computing)
bryn.addToCourses(english)
bigdave.addToCourses(pe)
jane.addToCourses(english)
conor.addToCourses(pe)
computing.addToStudents(joeg)
computing.addToStudents(brynb)
pe.addToStudents(dave)
pe.addToStudents(alan)
pe.addToStudents(henry)
english.addToStudents(belinda)
english.addToStudents(jonny)
wadi.addToCourses(computing)
dba.addToCourses(computing)
sysarchs.addToCourses(computing)
sportpsy.addToCourses(pe)
poems.addToCourses(english)
joeg.addToModules(dba)
joeg.addToModules(wadi)
joeg.addToModules(sysarchs)
belinda.addToModules(poems)
jonny.addToModules(poems)
brynb.addToModules(dba)
brynb.addToModules(wadi)
brynb.addToModules(sysarchs)
dave.addToModules(sportpsy)
alan.addToModules(sportpsy)
henry.addToModules(sportpsy)

    }
    def destroy = {
    }
}
