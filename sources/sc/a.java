package sc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
import p4.r;
public final class a implements Runnable {
    public final InputStream f48142a;
    public final Socket f48143b;
    public final j f48144c;

    public a(j jVar, InputStream inputStream, Socket socket) {
        this.f48144c = jVar;
        this.f48142a = inputStream;
        this.f48143b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f48142a;
        j jVar = this.f48144c;
        Socket socket = this.f48143b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d dVar = new d(jVar, new r(1), this.f48142a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dVar.c();
            }
            j.d(outputStream);
        } catch (Exception e7) {
            e = e7;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                j.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            j.d(outputStream2);
            j.d(inputStream);
            j.d(socket);
            ((List) jVar.f48177c.f3651c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            j.d(outputStream2);
            j.d(inputStream);
            j.d(socket);
            ((List) jVar.f48177c.f3651c).remove(this);
            throw th;
        }
        j.d(inputStream);
        j.d(socket);
        ((List) jVar.f48177c.f3651c).remove(this);
    }
}
