package yc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
import li.z3;
public final class a implements Runnable {
    public final InputStream f59359a;
    public final Socket f59360b;
    public final i f59361c;

    public a(i iVar, InputStream inputStream, Socket socket) {
        this.f59361c = iVar;
        this.f59359a = inputStream;
        this.f59360b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f59359a;
        i iVar = this.f59361c;
        Socket socket = this.f59360b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d dVar = new d(iVar, new z3(2), this.f59359a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dVar.c();
            }
            i.d(outputStream);
        } catch (Exception e11) {
            e = e11;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                i.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            i.d(outputStream2);
            i.d(inputStream);
            i.d(socket);
            ((List) iVar.f59398c.f680c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            i.d(outputStream2);
            i.d(inputStream);
            i.d(socket);
            ((List) iVar.f59398c.f680c).remove(this);
            throw th;
        }
        i.d(inputStream);
        i.d(socket);
        ((List) iVar.f59398c.f680c).remove(this);
    }
}
