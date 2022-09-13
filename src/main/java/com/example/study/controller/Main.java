package com.example.study.controller;
import java.util.*;
public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str =sc.nextLine();横向

//    }

    //    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
////        int num = in.nextInt();
////        in.nextLine();//多读一行，跳过换行符
//        int num = 2;
//        for(int i = 0; i < num; i++){
//            String s = in.nextLine();
//            System.out.println("s:"+s);
//        }
//    }

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        // a+b
//        ArrayList<String> arrayList = new ArrayList<>();
//        while (sc.hasNext()) { // 注意 while 处理多个 case
//            String a = sc.nextLine();
//            arrayList.add(a);
//            System.out.println(a);
//        }
//    }



//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str;
////        int num = Integer.parseInt(br.readLine());
//        int num = 1;
//        while((str = br.readLine()) != null&&(str = br.readLine()) != ""){
//            System.out.println("输出0："+str);
//        }
//        System.out.println("结束");
//    }

//public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String str;
//    while((str = br.readLine()) != null){
//        String[] tmp = str.split(" ");
//        if(tmp[0].equals("0"))break;
//        int sum = 0;
//        for(int i = 1; i <= Integer.parseInt(tmp[0]); i++){
//            int n = Integer.parseInt(tmp[i]);
//            sum += n;
//        }
//        System.out.println(sum);
//    }
//}

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        while(in.hasNextLine()){
//         String lineStr = in.nextLine();
//            System.out.println("lineStr:"+lineStr);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        while (in.hasNextInt()) {
//            int num = in.nextInt();
//            String str = in.nextLine();
//            System.out.println("num=" + num + ",str=" + str);
//            System.out.println("请输入一个整数");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
    //输入9
//        while (sc.hasNext()){
//            int n = sc.nextInt();
//            String [] arr = new String[n];
//            for(int i=0;i<n;i++){
//                String str = sc.next();
//                arr[i] = str;
//            }
//            Arrays.sort(arr);
//            for(int i=0;i<arr.length;i++){
//                System.out.println(arr[i]);
//            }
//        }
//        sc.close();
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // while(sc.hasNext()){
//        int n = sc.nextInt();
//        String[] arr = new String[n];
//        for(int i=0;i<n;i++){
//            arr[i]= sc.next();
//        }
//        int possiable = sc.nextInt();
//        int total= 0;
//        Integer [] brr=Arrays.stream(arr).map(Integer::parseInt).sorted().toArray(Integer[]::new);
//        for(int i=brr.length-1;i>=0;i--){
//            if(brr[i]>=possiable){
//                total++;
//                brr=Arrays.copyOf(brr,brr.length-1);
//            }
//        }
//        int lwa=0,lwb=brr.length-1;
//        while(lwa<lwb){
//            if(brr[lwa]+brr[lwb]>=possiable){
//                total++;
//                lwa++;
//                lwb--;
//            }else{
//                lwa++;
//            }
//        }
//        System.out.println(total);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xiao = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Student> list= new ArrayList<Student>();
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            Main main = new Main();
            Main.Student s = main.new Student(arr[i],Math.abs(arr[i]-xiao));
            list.add(s);
        }
        Collections.sort(list);
        for(Student l:list){
            System.out.print(l.heightV+" ");
        }

    }
class Student implements Comparable<Student>{
    public int heightV;
    public int sortV;
    Student(int heightV,int sortV){
        this.heightV = heightV;
        this.sortV = sortV;
    }

    @Override
    public int compareTo(Student o){
        return this.sortV-o.sortV;
    }
}

}