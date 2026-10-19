package tc;

import c5.c0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f46962a;
    public final SocketFactory f46963b;
    public final InetSocketAddress f46964c;
    public final int d;
    public final c0 e;
    public final c0 f46965f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c0 c0Var, c0 c0Var2) {
        this.f46962a = hVar;
        this.f46963b = socketFactory;
        this.f46964c = inetSocketAddress;
        this.d = i10;
        this.e = c0Var;
        this.f46965f = c0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f46962a) {
            try {
                if (((CountDownLatch) this.f46965f.f4726c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f46962a.a(exc);
                ((CountDownLatch) this.f46965f.f4726c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f46962a) {
            try {
                if (((CountDownLatch) this.f46965f.f4726c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f46962a.b(this, socket);
                ((CountDownLatch) this.f46965f.f4726c).countDown();
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
                ((CountDownLatch) c0Var.f4726c).await(c0Var.f4725b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f46962a;
            synchronized (hVar) {
                if (((Socket) hVar.f46943c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f46963b.createSocket();
                int i10 = r.f46956a;
                socket.connect(this.f46964c, this.d);
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
