package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f56547a;
    public final SocketFactory f56548b;
    public final InetSocketAddress f56549c;
    public final int d;
    public final b3.j f56550e;
    public final b3.j f56551f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, b3.j jVar, b3.j jVar2) {
        this.f56547a = hVar;
        this.f56548b = socketFactory;
        this.f56549c = inetSocketAddress;
        this.d = i7;
        this.f56550e = jVar;
        this.f56551f = jVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f56547a) {
            try {
                if (((CountDownLatch) this.f56551f.f2873c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56547a.a(exc);
                ((CountDownLatch) this.f56551f.f2873c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f56547a) {
            try {
                if (((CountDownLatch) this.f56551f.f2873c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f56547a.b(this, socket);
                ((CountDownLatch) this.f56551f.f2873c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            b3.j jVar = this.f56550e;
            if (jVar != null) {
                ((CountDownLatch) jVar.f2873c).await(jVar.f2872b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f56547a;
            synchronized (hVar) {
                if (((Socket) hVar.f56525c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f56548b.createSocket();
                int i7 = r.f56540a;
                socket.connect(this.f56549c, this.d);
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
