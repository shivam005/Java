package MultiTheading;

public class ThreadPractice  {
/*
* New
* Runnable (Ready to Run)
* Running
* Blocked/Waiting (waiting for some other task to get completed)
* Terminated/Dead (TASK Finished)
* */

    public static void main(String[] args) throws InterruptedException {
        Task2 t2= new Task2();
        Thread thread=new Thread(t2); // t2 is being stored in the Target instance variable of runnable
                                    // type in the Thread class.
        Task t= new Task();
        Task1 t1= new Task1();
        for (int i=0;i<10;i++){
            System.out.println("yes yes");
        }
        t.start();
        t.setPriority(10); // It is just request, it is not necessary that it will always be honoured
        thread.start();
        thread.join(); // It will be prioritised
        t1.start();

    }
}
