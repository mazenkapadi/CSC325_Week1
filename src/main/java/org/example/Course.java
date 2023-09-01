package org.example;

public class Course {
    protected int ID;
    protected String Name;
    protected String Code;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    Course()    {
        this.ID = 0;
        this.Name = "Software Engineering";
        this.Code = "CSC 325";
    }

    Course(int _id, String _name, String _code)    {
        this.ID = _id;
        this.Name = _name;
        this.Code = _code;
    }

    public String toString()    {
        return "Course ID: " + this.ID + "\nCourse Name: " + this.Name + "\nCourse Code: " + this.Code;
    }
}
