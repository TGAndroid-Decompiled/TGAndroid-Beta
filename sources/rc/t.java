package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f56537a;
    public final SocketFactory f56538b;
    public final InetSocketAddress f56539c;
    public final int d;
    public final b3.j f56540e;
    public final b3.j f56541f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, b3.j jVar, b3.j jVar2) {
        this.f56537a = hVar;
        this.f56538b = socketFactory;
        this.f56539c = inetSocketAddress;
        this.d = i7;
        this.f56540e = jVar;
        this.f56541f = jVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f56537a) {
            try {
                if (((CountDownLatch) this.f56541f.f2903c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56537a.a(exc);
                ((CountDownLatch) this.f56541f.f2903c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f56537a) {
            try {
                if (((CountDownLatch) this.f56541f.f2903c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56537a.b(this, socket);
                ((CountDownLatch) this.f56541f.f2903c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            b3.j jVar = this.f56540e;
            if (jVar != null) {
                ((CountDownLatch) jVar.f2903c).await(jVar.f2902b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f56537a;
            synchronized (hVar) {
                if (((Socket) hVar.f56515c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f56538b.createSocket();
                int i7 = r.f56530a;
                socket.connect(this.f56539c, this.d);
                b(socket);
            }
        } catch (Exception e10) {
            a(e10);
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
