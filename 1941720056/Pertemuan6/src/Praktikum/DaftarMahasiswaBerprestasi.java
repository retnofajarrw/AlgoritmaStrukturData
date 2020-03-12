package Praktikum;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah (Mahasiswa m){
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("Data sudah penu !!!!");
        }
    }
    
    void tampil(){
        for (Mahasiswa m:listMhs) {
            m.tampil();
            System.out.println("==============================");
        }
    }
    
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    //proses swap
                    
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
     void selectionSort(){
         for (int i = 0; i < listMhs.length-1; i++) {
             int idxMin = i;
             for (int j = i+1; j < listMhs.length; j++) {
                 if(listMhs[j].ipk<listMhs[idxMin].ipk){
                     idxMin = j;
                 }
             }
             //swap
             Mahasiswa tmp = listMhs[idxMin];
             listMhs[idxMin] = listMhs[i];
             listMhs[i]= tmp;
         }
     }
     
     void insertionSort(boolean ascending){
         int i,j;
         for (i = 0; i < listMhs.length; i++) {
             Mahasiswa temp = new Mahasiswa ();
             temp = listMhs[i];
             j=i;
             if (ascending){
                 while((j>0)&&(listMhs[j-1].ipk>temp.ipk)){
                 listMhs[j] = listMhs[j-1];
                 j--;
             }
             }else
             while((j<0)&&(listMhs[j-1].ipk>temp.ipk)){
                 listMhs[j] = listMhs[j-1];
                 j--;
             }
             listMhs[j] = temp;
         }
     }
    
}
