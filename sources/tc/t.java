package tc;

import c5.b0;
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
    public final b0 e;
    public final b0 f46965f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, b0 b0Var, b0 b0Var2) {
        this.f46962a = hVar;
        this.f46963b = socketFactory;
        this.f46964c = inetSocketAddress;
        this.d = i10;
        this.e = b0Var;
        this.f46965f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f46962a) {
            try {
                if (((CountDownLatch) this.f46965f.f4704c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f46962a.a(exc);
                ((CountDownLatch) this.f46965f.f4704c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f46962a) {
            try {
                if (((CountDownLatch) this.f46965f.f4704c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f46962a.b(this, socket);
                ((CountDownLatch) this.f46965f.f4704c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            b0 b0Var = this.e;
            if (b0Var != null) {
                ((CountDownLatch) b0Var.f4704c).await(b0Var.f4703b, TimeUnit.MILLISECONDS);
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
