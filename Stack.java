import java.lang.*;

public class Stack
{
    public static void main(String arg[])
    {
        SinglyLinkedListt obj = new SinglyLinkedListt();
        obj.push(10);
        obj.display();
        obj.pop();
        obj.display();


    }
}
class node<E>
{
    public E data;
    public node next;
}
class SinglyLinkedListt<E>
{
    public node head;
    public int count;

    public SinglyLinkedListt()
    {
        head = null;
        count =0;
    }

    public void push(E no)
    {
        node newn = new node();

        newn.data=no;
        newn.next=null;

        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next=head;
            head=newn;
        }
        count++;
    }


    public void display()
    {
        node temp = head;

        System.out.println("Elements of Linked list are : ");
        while(temp!=null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void pop()
    {
        if(count == 0)
        {
            return;
        }
        else if(count == 1)
        {
            head =null;
        }
        else
        {
            node temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        count--;
    }
    public int countNode()
    {
        return count;
    }

}

