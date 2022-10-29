package p3project;
import java.util.*;
public class P3PROJECT 
{
    public static Scanner input = new Scanner(System.in).useDelimiter("\n");
    public static boolean stat = true;
    public static String choose, username, password;
    public static String name, gender, address, agestatus, status, department, cod, tod;
    public static int id, age;
    private static final List<Patients> patientslist = new ArrayList<>();
    private static final Set<UniqueID> uniqueID = new HashSet<>();

    private static void NewPatient(Patients patients) 
    {
        patientslist.add(patients);
    }
    
    public static void main(String[] args) 
    {
        ExistingPatients();
        mainfunct();
    }

    // AYAW NANI APILA OG TYPE 
    //private static void GenerateUniqueID() 
    //{
       // Random r = new Random();
        //tid = r.nextInt(1000);
    //}

    private static void AddNewUniqueID() 
    {
        UniqueID fuid = new UniqueID(id);
        uniqueID.add(fuid);
    }
    
    private static void ExistingPatients() 
    {
        //GenerateUniqueID();
        
        Patients patient1 = new Patients(1, "Andrew Talaboc", "Male", "Indahag", 19, "Adult", "Dead", "Morgue", "Suicide", "12AM");
        Patients patient2 = new Patients(2, "Julie Galon", "Female", "Balulang", 20, "Adult", "Dead", "Morgue", "Suicide", "1PM");
        Patients patient3 = new Patients(3, "Angel Roth", "Female", "Iponan", 30, "Adult", "Normal", "Ward", "", "");
        Patients patient4 = new Patients(4, "Grant Boone", "Male", "Nazareth", 10, "Child", "Critical", "ICU", "", "");
        Patients patient5 = new Patients(5, "Alice Cooley", "Female", "Opol", 22, "Adult", "Normal", "Ward", "", "");
        Patients patient6 = new Patients(6, "Jeffrey Marshall", "Male", "Balulang", 18, "Adult", "Normal", "Ward", "", "");
        Patients patient7 = new Patients(7, "Mike Pierce", "Male", "Indahag", 16, "Teen", "Normal", "Ward", "", "");
        Patients patient8 = new Patients(8, "Sophia Bentley", "Female", "Bulua", 34, "Adult", "Critical", "ICU", "", "");
        Patients patient9 = new Patients(9, "Sheldon Newman", "Male", "Carmen", 13, "Child", "Normal", "Ward", "", "");
        Patients patient10 = new Patients(10, "Ignacio Shaw", "Male", "Patag", 11, "Child", "Critical", "ICU", "", "");
        Patients patient11 = new Patients(11, "Dolly Carson", "Female", "Upper Carmen", 25, "Adult", "Critical", "ICU", "", "");
        Patients patient12 = new Patients(12, "Pablo Wyatt", "Male", "Puerto", 28, "Adult", "Normal", "Ward", "", "");
        Patients patient13 = new Patients(13, "Carmella Velasquez", "Female", "Macasandig", 14, "Child", "Critical", "OR", "", "");
        Patients patient14 = new Patients(14, "Maryann Townsend", "Female", "Macanhan", 29, "Adult", "Critical", "OR", "", "");
        Patients patient15 = new Patients(15, "Jamie Ali", "Male", "Nazareth", 18, "Adult", "Critical", "OR", "", "");
        Patients patient16 = new Patients(16, "Kristopher Valencia", "Male", "Carmen", 19, "Adult", "Normal", "Ward", "", "");
        Patients patient17 = new Patients(17, "Lance Fox", "Male", "Indahag", 20, "Adult", "Dead", "Morgue", "Car Accident", "10PM");
        Patients patient18 = new Patients(18, "Vivian Benjamin", "Female", "Carmen", 23, "Adult", "Dead", "Morgue", "Hit and Run", "8AM");
        Patients patient19 = new Patients(19, "Nathanial Lynn", "Male", "Cogon", 16, "Teen", "Normal", "Ward", "", "");
        Patients patient20 = new Patients(20, "Sonya Wheeler", "Female", "Bulua", 10, "Child", "Normal", "Ward", "", "");
        patientslist.add(patient1);
        patientslist.add(patient2);
        patientslist.add(patient3);
        patientslist.add(patient4);
        patientslist.add(patient5);
        patientslist.add(patient6);
        patientslist.add(patient7);
        patientslist.add(patient8);
        patientslist.add(patient9);
        patientslist.add(patient10);
        patientslist.add(patient11);
        patientslist.add(patient12);
        patientslist.add(patient13);
        patientslist.add(patient14);
        patientslist.add(patient15);
        patientslist.add(patient16);
        patientslist.add(patient17);
        patientslist.add(patient18);
        patientslist.add(patient19);
        patientslist.add(patient20);
        
        UniqueID fuid1 = new UniqueID(1);
        UniqueID fuid2 = new UniqueID(2);
        UniqueID fuid3 = new UniqueID(3);
        UniqueID fuid4 = new UniqueID(4);
        UniqueID fuid5 = new UniqueID(5);
        UniqueID fuid6 = new UniqueID(6);
        UniqueID fuid7 = new UniqueID(7);
        UniqueID fuid8 = new UniqueID(8);
        UniqueID fuid9 = new UniqueID(9);
        UniqueID fuid10 = new UniqueID(10);
        UniqueID fuid11 = new UniqueID(11);
        UniqueID fuid12= new UniqueID(12);
        UniqueID fuid13 = new UniqueID(13);
        UniqueID fuid14 = new UniqueID(14);
        UniqueID fuid15 = new UniqueID(15);
        UniqueID fuid16 = new UniqueID(16);
        UniqueID fuid17 = new UniqueID(17);
        UniqueID fuid18 = new UniqueID(18);
        UniqueID fuid19= new UniqueID(19);
        UniqueID fuid20 = new UniqueID(20);
        uniqueID.add(fuid1);
        uniqueID.add(fuid2);
        uniqueID.add(fuid3);
        uniqueID.add(fuid4);
        uniqueID.add(fuid5);
        uniqueID.add(fuid6);
        uniqueID.add(fuid7);
        uniqueID.add(fuid8);
        uniqueID.add(fuid9);
        uniqueID.add(fuid10);
        uniqueID.add(fuid11);
        uniqueID.add(fuid12);
        uniqueID.add(fuid13);
        uniqueID.add(fuid14);
        uniqueID.add(fuid15);
        uniqueID.add(fuid16);
        uniqueID.add(fuid17);
        uniqueID.add(fuid18);
        uniqueID.add(fuid19);
        uniqueID.add(fuid20);
        //AddNewUniqueID();
    }

    private static void mainfunct() 
    {
        System.out.println("\n=====================");
        System.out.println("\nHospital Management System - Home Menu");
        System.out.println("\n=====================");
        System.out.println("[1] Add New Patients");
        System.out.println("[2] Show All Patient");
        System.out.println("[3] Search Patient");
        System.out.println("[4] Edit Patient Information");
        System.out.println("[5] Remove Patient");
        System.out.println("[6] Exit");
        System.out.println("Select from 1-6");
        System.out.println("=====================");
        stat = true;
        while (stat) {
            System.out.print("\nEnter Selection: ");
            choose = input.next();
            switch (choose) {
                case "1":
                    AddNewPatients();
                    stat = false;
                    break;
                case "2":
                    ShowAllPatient();
                    stat = false;
                    break;
                case "3":
                    System.out.println("\n=====================");
                    System.out.println("\nHospital Management System - Search Patient");
                    int i = 0;
                    while (i < 3) {
                        System.out.println("\n=====================");
                        System.out.print("\nEnter Patient ID: ");
                        String sid = input.next();
                        try {
                            id = Integer.parseInt(sid);
                            for (Patients patients : patientslist) {
                                if (patients.getid() == id) {
                                    SearchPatient(id);
                                }
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("\nNumbers Only");
                        }
                        System.out.println("\n=====================");
                        System.out.println("\nPatient not found");
                        i++;
                    }
                    System.out.println("\n=====================");
                    System.out.println("\nInvalid Attempt");
                    mainfunct();
                    break;
                case "4":
                    EditPatientInfo();
                    stat = false;
                    break;
                case "5":
                    RemovePatient();
                    stat = false;
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n=====================");
                    System.out.println("\nInvalid Selection");
                    System.out.println("\n=====================");
                    stat = true;
                    break;
            }
        }
    }

    private static void AddNewPatients() 
    {
        System.out.println("\n=====================");
        System.out.println("\nHospital Management System - Add Patient");
        System.out.println("\n=====================");
        stat = true;
        while(stat)
        {
            System.out.print("\nEnter Patient ID: ");
            String sid = input.next();
            try 
            {
                id = Integer.parseInt(sid);
                for(UniqueID cuid: uniqueID)
                {
                    if(cuid.getuid() == id)
                    {
                        System.out.println("ID Taken");
                        mainfunct();
                    }
                }
                    stat = false;
            } catch(NumberFormatException e)
                {
                    System.out.println("Numbers Only");
                    stat = true;
                }
        }
        System.out.println("\nPatient ID: " + id);
        System.out.print("Enter Patient Name: ");
        name = input.next();
        System.out.println("Select Gender");
        System.out.println("[1] Male");
        System.out.println("[2] Female");
        stat = true;
        while (stat) {
            System.out.print("Enter Selection: ");
            String sgchoose = input.next();
            try {
                int gchoose = Integer.parseInt(sgchoose);
                if (gchoose == 1) {
                    gender = "Male";
                    stat = false;
                } else if (gchoose == 2) {
                    gender = "Female";
                    stat = false;
                } else {
                    System.out.println("Invalid Selection");
                }
            } catch (NumberFormatException e) {
                System.out.println("Numbers Only");
            }
        }
        System.out.print("Enter Patient Address: ");
        address = input.next();
        stat = true;
        while (stat) {
            System.out.print("Enter Patient Age: ");
            String sage = input.next();
            try {
                age = Integer.parseInt(sage);
                if (age >= 0 && age <= 15) {
                    agestatus = "Child";
                } else if (age >= 16 && age <= 17) {
                    agestatus = "Teen";
                } else if (age >= 18 && age <= 59) {
                    agestatus = "Adult";
                } else if (age >= 60 && age <= 100) {
                    agestatus = "Senior";
                }
                stat = false;
            } catch (NumberFormatException e) {
                System.out.println("Numbers Only");
            }
        }
        System.out.println("Select Patient Status");
        System.out.println("[1] Normal");
        System.out.println("[2] Critical");
        System.out.println("[3] Dead");
        stat = true;
        while (stat) {
            System.out.print("Enter Selection: ");
            String sschoose = input.next();
            try {
                int schoose = Integer.parseInt(sschoose);
                if (schoose == 1) {
                    status = "Normal";
                    stat = false;
                } else if (schoose == 2) {
                    status = "Critical";
                    stat = false;
                } else if (schoose == 3) {

                    System.out.print("Enter Patient Cause Of Death: ");
                    cod = input.next();
                    System.out.print("Enter Patient Time Of Death: ");
                    tod = input.next();
                    status = "Dead";
                    stat = false;
                } else {
                    System.out.println("Invalid Selection");
                }
            } catch (NumberFormatException e) {
                System.out.println("Numbers Only");
            }
        }
        System.out.println("Select Patient Department");
        System.out.println("[1] ER");
        System.out.println("[2] OR");
        System.out.println("[3] ICU");
        System.out.println("[4] WARD");
        System.out.println("[5] MORGUE");
        stat = true;
        while (stat) {
            System.out.print("Enter Selection: ");
            String sdchoose = input.next();
            try {
                int dchoose = Integer.parseInt(sdchoose);
                if (dchoose == 1) {
                    department = "ER";
                    stat = false;
                } else if (dchoose == 2) {
                    department = "OR";
                    stat = false;
                } else if (dchoose == 3) {
                    department = "ICU";
                    stat = false;
                } else if (dchoose == 4) {
                    department = "Ward";
                    stat = false;
                } else if (dchoose == 5) {
                    department = "Morgue";
                    stat = false;
                } else {
                    System.out.println("Invalid Selection");
                }
            } catch (NumberFormatException e) {
                System.out.println("Numbers Only");
            }
        }
        
        Patients patients = new Patients(id, name, gender, address, age, agestatus, status, department, cod, tod);
        NewPatient(patients);
        AddNewUniqueID();
        System.out.println("\n=====================");
        System.out.println("\nSuccessfully Added");
        mainfunct();
    }

    private static void ShowAllPatient() 
    {
        System.out.println("\n=====================");
        System.out.println("\nHospital Management System - List of Patients");
        for (Patients patients : patientslist) {
            System.out.println("\n=====================");
            System.out.println("\nPatient ID: " + patients.getid());
            System.out.println("Patient Name: " + patients.getname());
            System.out.println("Patient Gender: " + patients.getgender());
            System.out.println("Patient Address: " + patients.getaddress());
            System.out.println("Patient Age: " + patients.getage());
            System.out.println("Patient Age Status: " + patients.getagestatus());
            System.out.println("Patient Status: " + patients.getstatus());
            System.out.println("Patient Department: " + patients.getdepartment());
            if (patients.getstatus().equals("Dead")) {
                System.out.println("Patient Cause of Death: " + patients.getcod());
                System.out.println("Patient Time of Death: " + patients.gettod());
            }
        }
        mainfunct();
    }

    private static void SearchPatient(int id) 
    {
        for (Patients patients : patientslist) {
            if (patients.getid() == id) {
                System.out.println("\n=====================");
                System.out.println("\nPatient Found");
                System.out.println("\nPatient ID: " + patients.getid());
                System.out.println("Patient Name: " + patients.getname());
                System.out.println("Patient Gender: " + patients.getgender());
                System.out.println("Patient Address: " + patients.getaddress());
                System.out.println("Patient Age: " + patients.getage());
                System.out.println("Patient Age Status: " + patients.getagestatus());
                System.out.println("Patient Status: " + patients.getstatus());
                System.out.println("Patient Department: " + patients.getdepartment());
                if (patients.getstatus().equals("Dead")) {
                    System.out.println("Patient Cause of Death: " + patients.getcod());
                    System.out.println("Patient Time of Death: " + patients.gettod());
                }
            }
        }
        System.out.println("\n=====================");
        System.out.println("Do you want to search again?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        System.out.println("=====================");
        System.out.print("\nEnter Selection: ");
        choose = input.next();
        switch (choose) {
            case "1":
                System.out.println("\n=====================");
                System.out.println("\nHospital Management System - Search Patient");
                stat = true;
                int i = 0;
                while (i < 3) {
                    System.out.println("\n=====================");
                    System.out.print("\nEnter Patient ID: ");
                    String sid = input.next();
                    try {
                        id = Integer.parseInt(sid);
                        for (Patients patients : patientslist) {
                            if (patients.getid() == id) {
                                SearchPatient(id);
                                stat = false;
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nNumbers Only");
                    }
                    //System.out.println("\n=====================");
                    //System.out.println("\nPatient not found");
                    //stat = true;
                    i++;
                }
                System.out.println("\n=====================");
                System.out.println("\nInvalid Attempt");
                mainfunct();
                break;
            case "2":
                mainfunct();
                break;
            default:
                System.out.println("\n=====================");
                System.out.println("\nInvalid Selection");
                SearchPatient(id);
                break;
        }

    }

    private static void EditPatientInfo() 
    {
        System.out.println("\n=====================");
        System.out.println("\nHospital Management System - Edit Patient Info");
        int i = 0;
        while (i < 3) {
            System.out.println("\n=====================");
            System.out.print("\nEnter Patient ID: ");
            String sid = input.next();
            try {
                id = Integer.parseInt(sid);
                for (Patients patients : patientslist) {
                    if (patients.getid() == id) {
                        System.out.println("\n=====================");
                        System.out.println("\nPatient ID: " + patients.getid());
                        System.out.println("Patient Name: " + patients.getname());
                        System.out.println("Patient Gender: " + patients.getgender());
                        System.out.println("Patient Address: " + patients.getaddress());
                        System.out.println("Patient Age: " + patients.getage());
                        System.out.println("Patient Age Status: " + patients.getagestatus());
                        System.out.println("Patient Status: " + patients.getstatus());
                        System.out.println("Patient Department: " + patients.getdepartment());
                        if (patients.getstatus().equals("Dead")) {
                            System.out.println("Patient Cause of Death: " + patients.getcod());
                            System.out.println("Patient Time of Death: " + patients.gettod());
                        }
                        System.out.println("\n=====================");
                        System.out.println("\nChange Information");
                        System.out.println("\n=====================");
                        System.out.println("[1] Patient Age");
                        System.out.println("[2] Patient Status");
                        System.out.println("[3] Patient Department");
                        System.out.println("[4] Patient Address");
                        System.out.println("=====================");
                        stat = true;
                        while (stat) {
                            System.out.print("\nEnter Selection: ");
                            String sichoose = input.next();
                            try {
                                int cichoose = Integer.parseInt(sichoose);
                                if (cichoose == 1) {
                                    stat = true;
                                    while (stat) {
                                        System.out.println("\n=====================");
                                        System.out.print("\nEnter New Patient Age: ");
                                        String cnage = input.next();
                                        try {
                                            age = Integer.parseInt(cnage);
                                            if (age >= 0 && age <= 15) {
                                                agestatus = "Child";
                                            } else if (age >= 16 && age <= 17) {
                                                agestatus = "Teen";
                                            } else if (age >= 18 && age <= 59) {
                                                agestatus = "Adult";
                                            } else if (age >= 60 && age <= 100) {
                                                agestatus = "Senior";
                                            }
                                            patients.setage(age);
                                            patients.setagestatus(agestatus);
                                            System.out.println("\nSuccessfully Changed");
                                            stat = false;
                                            mainfunct();
                                        } catch (NumberFormatException e) {
                                            System.out.println("Numbers Only");
                                        }
                                    }
                                } else if (cichoose == 2) {
                                    stat = true;
                                    while (stat) {
                                        System.out.println("\n=====================");
                                        System.out.println("New Patient Status");
                                        System.out.println("[1] Normal");
                                        System.out.println("[2] Critical");
                                        System.out.println("[3] Dead");
                                        System.out.println("=====================");
                                        System.out.print("\nEnter Selection: ");
                                        String snstatus = input.next();
                                        try {
                                            int nstatus = Integer.parseInt(snstatus);
                                            if (nstatus == 1) {
                                                status = "Normal";
                                                patients.setstatus(status);
                                                System.out.println("\nSuccessfully Changed");
                                                stat = false;
                                                mainfunct();
                                            } else if (nstatus == 2) {
                                                status = "Critical";
                                                patients.setstatus(status);
                                                System.out.println("\nSuccessfully Changed");
                                                stat = false;
                                                mainfunct();
                                            } else if (nstatus == 3) {
                                                status = "Dead";
                                                department = "Morgue";
                                                System.out.print("Enter Patient Cause Of Death: ");
                                                cod = input.next();
                                                System.out.print("Enter Patient Time Of Death: ");
                                                tod = input.next();
                                                patients.setstatus(status);
                                                patients.setcod(cod);
                                                patients.settod(tod);
                                                patients.setdepartment(department);
                                                System.out.println("\nSuccessfully Changed");
                                                stat = false;
                                                mainfunct();
                                            }
                                        } catch (NumberFormatException e) {
                                            System.out.println("Numbers Only");
                                        }
                                    }
                                } else if (cichoose == 3) {
                                    stat = true;
                                    while (stat) {
                                        System.out.println("\n=====================");
                                        System.out.println("New Patient Department");
                                        System.out.println("[1] ER");
                                        System.out.println("[2] OR");
                                        System.out.println("[3] ICU");
                                        System.out.println("[4] WARD");
                                        System.out.println("[5] MORGUE");
                                        System.out.println("=====================");
                                        System.out.print("\nEnter Selection: ");
                                        String sndept = input.next();
                                        try {
                                            int ndept = Integer.parseInt(sndept);
                                            if (ndept == 1) {
                                                department = "ER";
                                                patients.setdepartment(department);
                                                System.out.println("\nSuccessfully Changed");
                                                stat = false;
                                                mainfunct();
                                            } else if (ndept == 2) {
                                                department = "OR";
                                                patients.setdepartment(department);
                                                System.out.println("\nSuccessfully Changed");
                                                stat = false;
                                                mainfunct();
                                            } else if (ndept == 3) {
                                                department = "ICU";
                                                patients.setdepartment(department);
                                                System.out.println("\nSuccessfully Changed");
                                                stat = false;
                                                mainfunct();
                                            } else if (ndept == 4) {
                                                department = "Ward";
                                                patients.setdepartment(department);
                                                System.out.println("\nSuccessfully Changed");
                                                stat = false;
                                                mainfunct();
                                            } else if (ndept == 5) {
                                                department = "Morgue";
                                                patients.setdepartment(department);
                                                System.out.println("\nSuccessfully Changed");
                                                stat = false;
                                                mainfunct();
                                            }
                                        } catch (NumberFormatException e) {
                                            System.out.println("Numbers Only");
                                        }
                                    }
                                } else if (cichoose == 4) {
                                    System.out.println("\n=====================");
                                    System.out.print("\nEnter New Patient Address: ");
                                    String naddress = input.next();
                                    patients.setaddress(naddress);
                                    System.out.println("\nSuccessfully Changed");
                                    stat = false;
                                    mainfunct();
                                } else {
                                    System.out.println("\n=====================");
                                    System.out.println("\nInvalid Selection");
                                    System.out.println("\n=====================");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Numbers Only");
                            }
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Numbers Only");
            }
            System.out.println("\n=====================");
            System.out.println("\nPatient not found");
            i++;
        }
        System.out.println("\n=====================");
        System.out.println("\nInvalid Attempt");
        mainfunct();
    }

    private static void RemovePatient() 
    {
        System.out.println("\n=====================");
        System.out.println("\nHospital Management System - Remove Patient");
        int i = 0;
        while (i < 3) {
            System.out.println("\n=====================");
            System.out.print("\nEnter Patient ID: ");
            String rid = input.next();
            try {
                id = Integer.parseInt(rid);
                for (Patients patients : patientslist) {
                    for (UniqueID fuid : uniqueID) {
                        if (patients.getid() == id && fuid.getuid() == id) {
                            System.out.println("\n=====================");
                            System.out.println("\nPatient ID: " + fuid.getuid());
                            System.out.println("Patient Name: " + patients.getname());
                            System.out.println("\nSuccessfully Removed");
                            patientslist.remove(patients);
                            uniqueID.remove(fuid);
                            mainfunct();
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\nNumbers Only");
            }
            System.out.println("\n=====================");
            System.out.println("\nPatient not found");
            i++;
        }
        System.out.println("\n=====================");
        System.out.println("\nInvalid Attempt");
        mainfunct();
    }
}
