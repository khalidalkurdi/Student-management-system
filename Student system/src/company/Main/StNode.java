package company.Main;

public class StNode {
    public Student element;
    public StNode next;

    //****************************************************************************
    public StNode() {
        element=null;
        next=null;
    }

    public StNode(Student element) {
        this.element = element;
        next = null;
    }
    public StNode(Student element, StNode nextl) {
        this.element = element;
        this.next = next;
    }


}