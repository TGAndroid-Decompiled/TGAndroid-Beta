package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f56578a;
    public final SocketFactory f56579b;
    public final InetSocketAddress f56580c;
    public final int d;
    public final b3.j f56581e;
    public final b3.j f56582f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, b3.j jVar, b3.j jVar2) {
        this.f56578a = hVar;
        this.f56579b = socketFactory;
        this.f56580c = inetSocketAddress;
        this.d = i7;
        this.f56581e = jVar;
        this.f56582f = jVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f56578a) {
            try {
                if (((CountDownLatch) this.f56582f.f2915c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56578a.a(exc);
                ((CountDownLatch) this.f56582f.f2915c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f56578a) {
            try {
                if (((CountDownLatch) this.f56582f.f2915c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56578a.b(this, socket);
                ((CountDownLatch) this.f56582f.f2915c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            b3.j jVar = this.f56581e;
            if (jVar != null) {
                ((CountDownLatch) jVar.f2915c).await(jVar.f2914b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f56578a;
            synchronized (hVar) {
                if (((Socket) hVar.f56556c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f56579b.createSocket();
                int i7 = r.f56571a;
                socket.connect(this.f56580c, this.d);
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
