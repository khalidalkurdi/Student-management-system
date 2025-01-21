package company.Main;
public class StudentSLL {
   public StNode head;

    //****************************************************************************
    //constructor
    public StudentSLL() {
        head=null;
    }
    public StudentSLL(StNode e) {
        head=e;
    }
    //***************************************************************************
    public void AddStudent(Student S){
        if(S.getGPA()== -999999 || S.getId() == -999999){
            System.out.println("can not add the student because id or GPA is not correct");
        }
        else {
                    StNode n = new StNode(S);
                    //addFirst
                    if (head == null) {
                        head = n;
                    } else {
                        StNode ptr1 = head;
                        StNode ptr2 = null;
                        //**********************
                        while (ptr1 != null) {
                            if (ptr1.element.getId() == n.element.getId()) {
                                break;
                            } else if (ptr1.element.getId() > n.element.getId()) {
                                break;
                            } else {
                                ptr2 = ptr1;
                                ptr1 = ptr1.next;
                            }
                        }
                        //************************

                        //addfirst if all values id more than n.getid
                        if (ptr2 == null) {
                            n.next = head;
                            head = n;
                        } else if (ptr1 != null) {
                            //same with anouther id
                            if (ptr1.element.getId() == n.element.getId()) {
                                System.out.println("this id is same whith another id Please change and try");
                            }
                            //add before
                            else {
                                n.next = ptr2.next;
                                ptr2.next = n;
                            }
                        }
                        //addLast
                        else {
                            ptr2.next = n;
                        }
                    }

        }//end else
    }//end method

    //*****************************************************************************
    public void RemoveStudent (int id){
        //empty
        if(head==null)
            System.out.println("empty studentSLL");
        //not Empty
        StNode ptr1=head;
        StNode ptr2=null;
        while(ptr1!=null) {
            if(ptr1.element.getId()==id){
                break;
            }else{
                ptr2=ptr1;
                ptr1=ptr1.next;
            }
        }
        //one node just
        if(ptr2==null){
            head=null;}
        //delin + dellast
        else if(ptr1!=null){
            ptr2.next=ptr1.next;}
        else{
            System.out.println("not found student");
        }

    }
    //*****************************************************************************
    public Student[] GetStudents (String M){
        //empty
        if(head==null){System.out.println("StudentSLL is Empty");}
        //not Empty
        Student St[];
        StNode ptr=head;
        Student temp;
        //-------------------------
        //count element
        int size=0;
        while (ptr!=null) {
            if(ptr.element.Major.equals(M)){
                size++;
            }
            ptr=ptr.next;
        }
        //------------------------
        //creat arry siz
        ptr=head;
        St =new Student[size];
        int i=0;
        while(ptr!=null) {
            if(ptr.element.Major.equals(M)){
                St[i]=ptr.element;
                i++;
            }
            ptr=ptr.next;
        }

        //-----------------------
        //compare and sort
        for (int j = 1; j <=size; j++) {
                for (int k = 0; k < (size-j); k++) {
                        if(St[k].name.compareTo(St[k+1].name)>0){
                            //swap
                            temp=St[k];
                            St[k]=St[k+1];
                            St[k+1]=temp;
                        }
                }

        }
        //--------------------
        return St;
    }
    //*****************************************************************************
    public Student FindStudent (String Name){
        //empty
        if(head==null){  System.out.println("StudentSLL is Empty");}
        //not Empty
        StNode ptr=head;
        while (ptr!=null) {
            if(ptr.element.name.equals(Name)){
                break;
            }else{ptr=ptr.next;}
        }
        //is found
        if(ptr!=null){
            return ptr.element;}
        //not found
        else{System.out.println("is not found");}

        return null;
    }
    //*****************************************************************************
    public Student FindStudent (int id){
        //empty
        if(head==null){  System.out.println("StudentSLL is Empty");}
        //not Empty
        StNode ptr=head;
        while (ptr!=null) {
            if(ptr.element.getId()==id){
                break;
            }else{ptr=ptr.next;}
        }
        //is found
        if(ptr!=null){
            return ptr.element;}
        //not found
        else{System.out.println("is not found");}

        return null;
    }
    //*****************************************************************************
    public void FindTopOne (){
        //empty
        if(head==null){System.out.println("StudentSLL is Empty");}
        //one Student just
        else if(head.next==null){System.out.println("one student just");}
        else{
            //not Empty
            double topGPA=head.element.getGPA();
            StNode ptr=head.next;
            StNode ptrStudenTop=head;
            while (ptr!=null) {
                if(ptr.element.getGPA()>topGPA){
                    topGPA=ptr.element.getGPA();
                    ptrStudenTop=ptr;
                }
                ptr=ptr.next;
            }
            //more than one student
                System.out.println(ptrStudenTop.element.toString());
        }
    }
    //*****************************************************************************
    public void Print(int id){
        //empty
        if(head==null){  System.out.println("StudentSLL is Empty");}
        //not Empty
        StNode ptr=head;
        while (ptr!=null) {
            if(ptr.element.getId()==id){
                break;
            }else{ptr=ptr.next;}
        }
        //is found
        if(ptr!=null){
            System.out.println(ptr.element.toString());}
        //not found
        else{System.out.println("is not found");}
    }
    //********************************************************************************
    //optional
    public void PrintAll(){
        StNode ptr=head;
        while (ptr!=null){
            System.out.println(ptr.element.toString());
            ptr=ptr.next;
        }
    }
    //********************************************************************************
}//end class

