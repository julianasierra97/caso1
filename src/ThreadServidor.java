

public class ThreadServidor extends Thread{

private Buffer buffer;

    public ThreadServidor(Buffer buffer) {
        this.buffer = buffer;
    }


    public void run() {
        while(true) {
            buffer.retirarMensaje();
        }

    }
}
