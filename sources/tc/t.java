package tc;

import c5.c0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f47408a;
    public final SocketFactory f47409b;
    public final InetSocketAddress f47410c;
    public final int d;
    public final c0 e;
    public final c0 f47411f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c0 c0Var, c0 c0Var2) {
        this.f47408a = hVar;
        this.f47409b = socketFactory;
        this.f47410c = inetSocketAddress;
        this.d = i10;
        this.e = c0Var;
        this.f47411f = c0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f47408a) {
            try {
                if (((CountDownLatch) this.f47411f.f4729c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47408a.a(exc);
                ((CountDownLatch) this.f47411f.f4729c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f47408a) {
            try {
                if (((CountDownLatch) this.f47411f.f4729c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47408a.b(this, socket);
                ((CountDownLatch) this.f47411f.f4729c).countDown();
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
            h hVar = this.f47408a;
            synchronized (hVar) {
                if (((Socket) hVar.f47389c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f47409b.createSocket();
                int i10 = r.f47402a;
                socket.connect(this.f47410c, this.d);
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
