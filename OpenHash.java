public class OpenHash{
    private KeyValue[] table;
    private int size;

{public OpenHash(int m){
    table =new.KeyValue[m +1];
    size =m;

}//Hash Function 
private int hash(String key){
    int h =0;
    for(int i =0;i<key.length();i++){
        h=h*31 +key.charAt(i);

    }return((h & 0x7fffffff)% size)+1;
}

public void insert (String key,String value){
    int index=hash(key);

    while(table[index] !=null){
        if (table[index].key.equals(key)){
            table[index].value=value;
            return;
        }
    }
    index =index% size +1;

}
table[index]=new KeyValuie(key,value);


}public String lookup(String key){
    int index=hash(key);
    int startIndex=index;

    while (table[index] != null){
        if(table[index].key.equals(key)){
            return table[index].value;
        }
        index =index %size +1;

        //If went all way around,stop


        if (index==startIndex){
            break;
        }return null;
    }public boolean isInTable(String key){
    return lookup(key) !=null;
}
   

}
}