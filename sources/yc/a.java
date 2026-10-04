package yc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f50814a;
    public final Socket f50815b;
    public final i f50816c;

    public a(i iVar, InputStream inputStream, Socket socket) {
        this.f50816c = iVar;
        this.f50814a = inputStream;
        this.f50815b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f50814a;
        i iVar = this.f50816c;
        Socket socket = this.f50815b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e7) {
            e = e7;
        }
        try {
            d dVar = new d(iVar, new n2.c(26), this.f50814a, outputStream, socket.getInetAddress());
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
            ((List) iVar.f50853c.f8696c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            i.d(outputStream2);
            i.d(inputStream);
            i.d(socket);
            ((List) iVar.f50853c.f8696c).remove(this);
            throw th;
        }
        i.d(inputStream);
        i.d(socket);
        ((List) iVar.f50853c.f8696c).remove(this);
    }
}
