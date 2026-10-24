package tc;

import c5.c0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f47407a;
    public final SocketFactory f47408b;
    public final InetSocketAddress f47409c;
    public final int d;
    public final c0 e;
    public final c0 f47410f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c0 c0Var, c0 c0Var2) {
        this.f47407a = hVar;
        this.f47408b = socketFactory;
        this.f47409c = inetSocketAddress;
        this.d = i10;
        this.e = c0Var;
        this.f47410f = c0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f47407a) {
            try {
                if (((CountDownLatch) this.f47410f.f4729c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47407a.a(exc);
                ((CountDownLatch) this.f47410f.f4729c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f47407a) {
            try {
                if (((CountDownLatch) this.f47410f.f4729c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47407a.b(this, socket);
                ((CountDownLatch) this.f47410f.f4729c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c0 c0Var = this.e;
            if (c0Var != null) {
                ((CountDownLatch) c0Var.f4729c).await(c0Var.f4728b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f47407a;
            synchronized (hVar) {
                if (((Socket) hVar.f47388c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f47408b.createSocket();
                int i10 = r.f47401a;
                socket.connect(this.f47409c, this.d);
                b(socket);
            }
        } catch (Exception e) {
            a(e);
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
