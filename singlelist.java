package assignment1;

public class singlelist {

    private singleNode head;
    private int size=0; 
    private static final int listsize=15;

    public void add(int score,String name){

        singleNode newNode= new singleNode(score,name);

        if (head==null||score>head.score){
            newNode.next=head;
            head=newNode;
        }
        else{
            singleNode cur=head;

            while(cur.next!=null && cur.next.score>=score){
                cur=cur.next;
            }

            newNode.next=cur.next;
            cur.next=newNode;
        }

        size++;

        if(size>listsize){
            removeLast();
        }


    }

    private void removeLast(){
        if (head==null){
            return;
        }

        if(head.next==null){
            head=null;
        }
        else{
            singleNode cur=head;
            while(cur.next.next!=null){
                cur=cur.next;
            }
            cur.next=null;
        }
        size--;
    }

    public void print(){
        singleNode cur=head;
        int index=0;

        while (cur!=null){
            System.out.println("\t"+cur.name+"\t"+cur.score);
            cur=cur.next;
            index++; 
        }
    }
 
}
