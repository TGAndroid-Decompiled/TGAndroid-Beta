package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f56660a;
    public final SocketFactory f56661b;
    public final InetSocketAddress f56662c;
    public final int d;
    public final b3.j f56663e;
    public final b3.j f56664f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, b3.j jVar, b3.j jVar2) {
        this.f56660a = hVar;
        this.f56661b = socketFactory;
        this.f56662c = inetSocketAddress;
        this.d = i7;
        this.f56663e = jVar;
        this.f56664f = jVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f56660a) {
            try {
                if (((CountDownLatch) this.f56664f.f2874c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56660a.a(exc);
                ((CountDownLatch) this.f56664f.f2874c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f56660a) {
            try {
                if (((CountDownLatch) this.f56664f.f2874c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56660a.b(this, socket);
                ((CountDownLatch) this.f56664f.f2874c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            b3.j jVar = this.f56663e;
            if (jVar != null) {
                ((CountDownLatch) jVar.f2874c).await(jVar.f2873b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f56660a;
            synchronized (hVar) {
                if (((Socket) hVar.f56638c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f56661b.createSocket();
                int i7 = r.f56653a;
                socket.connect(this.f56662c, this.d);
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
