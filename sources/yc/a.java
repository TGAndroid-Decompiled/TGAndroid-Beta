package yc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
import ji.b4;
public final class a implements Runnable {
    public final InputStream f49924a;
    public final Socket f49925b;
    public final i f49926c;

    public a(i iVar, InputStream inputStream, Socket socket) {
        this.f49926c = iVar;
        this.f49924a = inputStream;
        this.f49925b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f49924a;
        i iVar = this.f49926c;
        Socket socket = this.f49925b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d dVar = new d(iVar, new b4(1), this.f49924a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dVar.c();
            }
            i.d(outputStream);
        } catch (Exception e10) {
            e = e10;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                i.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            i.d(outputStream2);
            i.d(inputStream);
            i.d(socket);
            ((List) iVar.f49963c.f8895c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            i.d(outputStream2);
            i.d(inputStream);
            i.d(socket);
            ((List) iVar.f49963c.f8895c).remove(this);
            throw th;
        }
        i.d(inputStream);
        i.d(socket);
        ((List) iVar.f49963c.f8895c).remove(this);
    }
}
