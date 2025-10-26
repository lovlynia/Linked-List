package assignment1;

public class doublelist {

    private hw1Node head;
    private hw1Node tail;
    private int size=0; 
    private static final int listtotal=15;

    public void add(int score,String name){

        hw1Node newNode= new hw1Node(score,name);

        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else if (score>head.score){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;

        }
        else{
            hw1Node cur = head;
            while(cur.next!=null && cur.next.score>=score){
                cur=cur.next;
            }
            newNode.next=cur.next;
            newNode.prev=cur;

            if(cur.next!=null){
                cur.next.prev=newNode;
            }else{
               
                tail=newNode;
            }

            cur.next=newNode;
            }
        
            size++;

            if(size>listtotal){
                removeLast();
            }
        }

        private void removeLast(){
        if (tail==null){
            return;
        }

        if(tail.prev!=null){
            tail=tail.prev;
            tail.next=null;
        }
        else{
            head=null;
            tail=null;  
        }
        size--;
    }

    public void remove(int i){
        if(i<0||i>=size){
            System.out.println("out of bounds");
            return;
        }

        hw1Node cur;

        if(i<size/2){
            cur=head;
            for(int x=0;x<i;x++){
                cur=cur.next;
            }
        }
        else
        {
            cur=tail;
            for(int x=size-1;x>i;x--){
                cur=cur.prev;
            }
        }

        if(cur.prev!=null){
            cur.prev.next=cur.next;
        }else{
            head=cur.next;
        }

        if (cur.next!=null){
            cur.next.prev=cur.prev;

        }else{
            tail=cur.prev;
        }

        size--;
    }

    public void print(){
        hw1Node cur=head;

        while (cur!=null){
            System.out.println("\t"+cur.name+"\t"+cur.score);
            cur=cur.next;
        }
    }


}


    


    

