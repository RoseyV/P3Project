package p3project;

public class Patients 

{

    private String pname, pgender, paddress, pagestatus, pstatus, pdepartment, pcod, ptod;

    private int pid, page;

    

    Patients(int id, String name, String gender, String address, int age, String agestatus, String status, String department, String causeofdeath, String timeofdeath)

    {

        this.pid = id;

        this.pname = name;

        this.pgender = gender;

        this.paddress = address;

        this.page = age;

        this.pagestatus = agestatus;

        this.pstatus = status;

        this.pdepartment = department;

        this.pcod = causeofdeath;

        this.ptod = timeofdeath;

    }

    

    public int getid()

    {

        return pid;

    }

    

    public void setid(int id)

    {

        this.pid = id;

    }

    

    public String getname()

    {

        return pname;

    }

    

    public void setname(String name)

    {

        this.pname = name;

    }

        

    public String getgender()

    {

        return pgender;

    }

    

    public void setgender(String gender)

    {

        this.pgender = gender;

    }

    

    public String getaddress()

    {

        return paddress;

    }

    

    public void setaddress(String address)

    {

        this.paddress = address;

    }

    

    public int getage()

    {

        return page;

    }

    

    public void setage(int age)

    {

        this.page = age;

    }

    

    public String getagestatus()

    {

        return pagestatus;

    }

    

    public void setagestatus(String agestatus)

    {

        this.pagestatus = agestatus;

    }

    

    public String getstatus()

    {

        return pstatus;

    }

    

    public void setstatus(String status)

    {

        this.pstatus = status;

    }

    

    public String getdepartment()

    {

        return pdepartment;

    }

    

    public void setdepartment(String department)

    {

        this.pdepartment = department;

    }

    

    public String getcod()

    {

        return pcod;

    }

    

    public void setcod(String causeofdeath)

    {

        this.pcod = causeofdeath;

    }

    

     public String gettod()

    {

        return ptod;

    }

    

    public void settod(String timeofdeath)

    {

        this.ptod = timeofdeath;

    }

}
