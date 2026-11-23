package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f56582a;
    public final SocketFactory f56583b;
    public final InetSocketAddress f56584c;
    public final int d;
    public final b3.j f56585e;
    public final b3.j f56586f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, b3.j jVar, b3.j jVar2) {
        this.f56582a = hVar;
        this.f56583b = socketFactory;
        this.f56584c = inetSocketAddress;
        this.d = i7;
        this.f56585e = jVar;
        this.f56586f = jVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f56582a) {
            try {
                if (((CountDownLatch) this.f56586f.f2922c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56582a.a(exc);
                ((CountDownLatch) this.f56586f.f2922c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f56582a) {
            try {
                if (((CountDownLatch) this.f56586f.f2922c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56582a.b(this, socket);
                ((CountDownLatch) this.f56586f.f2922c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            b3.j jVar = this.f56585e;
            if (jVar != null) {
                ((CountDownLatch) jVar.f2922c).await(jVar.f2921b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f56582a;
            synchronized (hVar) {
                if (((Socket) hVar.f56560c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f56583b.createSocket();
                int i7 = r.f56575a;
                socket.connect(this.f56584c, this.d);
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
