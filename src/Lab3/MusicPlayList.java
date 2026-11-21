package Lab3;

public class MusicPlayList {
    private SongNode head;
    private SongNode tail;
    private SongNode curr;      //curr=current

    public MusicPlayList(){   // default constructor
        head=null;
        tail=null;
        curr=null;

    }
    public void addSong(String title){
        SongNode newNode=new SongNode(title);
        if(head==null){    //if list is empty
            head=newNode;
            tail=newNode;
            curr=newNode;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void removeSong(String title){
        SongNode temp=head;
        while(temp!=null&&!temp.title.equals(title)){
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("The song(which searched)is not in the playlist");
            return;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;

        }else{
            head=temp.next;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;

        }else{
            tail=temp.prev;
        }




        if(curr==temp){
            if(temp.next!=null){
                curr=temp.next;
            }else{
                curr=temp.prev;
            }
        }


    System.out.println("removed:"+title);
    }

    public void nextSong(){
        if(curr!=null&&curr.next!=null){
            curr=curr.next;
            System.out.println("Playing:"+curr.title);
        }else{
            System.out.println("Already at the last song of the playlist");
        }
    }

    public void previousSong(){
        if(curr!=null&&curr.prev!=null){
            curr=curr.prev;
            System.out.println("Playing:"+curr.title);
        }else{
            System.out.println("Already at the first song of the playlist");
        }
    }




    public void displayCurrentSong(){
        if(curr==null){
            System.out.println("the playlist is empty!!!");

        }else{
            System.out.println("Current song:"+curr.title);


        }
    }


    public void displayPlayList(){
        SongNode temp=head;
        while(temp!=null){
            System.out.print(temp.title+" <-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }








}
