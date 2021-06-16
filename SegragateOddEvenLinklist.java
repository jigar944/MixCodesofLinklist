public class SegragateOddEvenLinklist
{

    static Node head;

    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        SegragateOddEvenLinklist linklist = new SegragateOddEvenLinklist();
      
        linklist.add(5);
        linklist.add(7);
        linklist.add(9);
        linklist.add(10);
        linklist.add(12);
        linklist.add(17);
        linklist.add(3);

        linklist.printLinklist();

        segragate(linklist);


    }





    private static void segragate(SegragateOddEvenLinklist linklist) {

        Node evenStarNode=null;
        Node evenEndNode=null;
        Node oddStarNode=null;
        Node oddEndNode=null;

       
       Node temp = head;

       while(temp!=null){

           if(temp.data%2!=0){

                if(oddStarNode==null){
                    oddStarNode = temp;
                    oddEndNode = oddStarNode;
                }
                else{
                    oddEndNode.next = temp;
                    oddEndNode = oddEndNode.next;
                }
                temp = temp.next;

              
           }
           else{

                if(evenStarNode==null){
                    evenStarNode = temp;
                    evenEndNode = evenStarNode;
                }else{
                    evenEndNode.next = temp;
                    evenEndNode = evenEndNode.next;
                }
                temp = temp.next;

               
           }


       }


       oddEndNode.next = evenStarNode;
       evenEndNode.next = null;
       Node temp1 = oddStarNode;

       while(temp1!=null){
           System.out.print(temp1.data+" ");
           temp1 = temp1.next;
       }
      
    }




    public static void add(int data) {

        if(head == null){
            head = new Node(data);
            return;
        }

        Node end=head;

        while(end.next!=null){
            end = end.next;
        }
        

        Node temp = new Node(data);
        end.next = temp;
        
        
    }

    private static void printLinklist() {

        Node current = head;
        while(current.next!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println(current.data);

    }
}
