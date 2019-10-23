public class testqueue {
    public static void main(String[] args) {
      TugasQueue x = new TugasQueue(5);
      x.enqueue(5);
      x.enqueue(3);
      x.enqueue(2);
      x.enqueue(32);
      x.enqueue(1);
      try{
          System.out.println(x.dequeue());
          System.out.println(x.dequeue());
          System.out.println(x.dequeue());
          System.out.println(x.dequeue());
          System.out.println(x.dequeue());
      } catch (Exception e){
          System.out.println("queue kosong");
      }
        System.out.println("------------------------------");
        x.print();
    }
}
