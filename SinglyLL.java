import java.lang.*;
import java.util.*;

public class SinglyLL
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        SinglyLinkedListt obj = new SinglyLinkedListt();
		       obj.insertFirst(10);
        obj.insertLast(20);

        obj.insertLast(30);
        obj.insertLast(40);
        obj.display();
        obj.deleteFirst();
        obj.display();
        obj.deleteLast();
        obj.display();
        obj.insertAtPos(11.1,1);
        obj.insertAtPos("Geetesh",2);
        System.out.println("Element in linked list :"+obj.countNode());
        obj.display();
        obj.insertAtPos(5.2222,2);
        System.out.println("Element in linked list :"+obj.countNode());
        obj.display();
        obj.deleteAtPos(2);
        System.out.println("Element in linked list :"+obj.countNode());
        obj.display();

    }
}
class Node<E>
{
    public E data;
    public node next;
}
class SinglyLinkedList<E>
{
    public node head;
    public int count;

    public SinglyLinkedList()
    {
        head = null;
        count =0;
    }
    //obj.insertFirst(10);

    //obj.insertFirst(11);
    public <E> void insertFirst(E no)
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

    public <E> void insertLast(E no)
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
            node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
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
    public void deleteFirst()
    {
        if(count == 0)
        {
            return;
        }
        else if(count == 1)
        {
            head = null;
        }
        else
        {
            node temp = head;
            head = head.next;
            temp = null;
        }
        count--;
    }
    public void deleteLast()
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
    public <E> void insertAtPos(E no,int pos)
    {

        if((pos < 1) || (count+1 < pos))
        {
            System.out.println("Your position doesn't exist");
            return;
        }
        if(pos == 1)
        {
            insertFirst(no);
        }
        else if(pos == count+1)
        {
            insertLast(no);
        }
        else
        {
            node newn = new node();
            newn.data = no;
            newn.next=null;

            node temp = head;

            for(int i=1;i<pos-1;i++)
            {
                temp = temp.next;
            }
            newn.next=temp.next;
            temp.next=newn;

            count++;
        }
    }
    public void deleteAtPos(int pos)
    {

        if((pos < 1) || (count < pos))
        {
            return;
        }
        if(pos == 1)
        {
            deleteFirst();
        }
        else if(pos == count)
        {
            deleteLast();
        }
        else
        {
            node temp = head;

            for(int i=1;i<pos-1;i++)
            {
                temp = temp.next;
            }
            temp.next=temp.next.next;

            count--;
        }
    }
}
