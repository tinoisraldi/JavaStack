public class TugasQueue{
public int [] nilai;
public int tail;
public TugasQueue(int jumlah){
    nilai = new int[jumlah];
}
public void enqueue(int angka){
    if(tail< nilai.length){
        nilai[tail++] = angka;
    } else {

    }
}
public int dequeue() throws Exception{
    if (tail>0){
        int angka = nilai[0];
        for (int i = 0; i < nilai.length-1 ; i++) {
           nilai[i]=nilai[i+1];
        }
        tail--;
        return angka;
    }
else {
    throw new Exception("KOSONG");
    }
}
    public void print(){
        for (int i = nilai.length-1;i>=0;i--){
            System.out.println(nilai[i]);
        }
}
}