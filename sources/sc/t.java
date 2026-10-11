package sc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f48024a;
    public final SocketFactory f48025b;
    public final InetSocketAddress f48026c;
    public final int d;
    public final c5.b0 f48027e;
    public final c5.b0 f48028f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c5.b0 b0Var, c5.b0 b0Var2) {
        this.f48024a = hVar;
        this.f48025b = socketFactory;
        this.f48026c = inetSocketAddress;
        this.d = i10;
        this.f48027e = b0Var;
        this.f48028f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f48024a) {
            try {
                if (((CountDownLatch) this.f48028f.f4203c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f48024a.a(exc);
                ((CountDownLatch) this.f48028f.f4203c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f48024a) {
            try {
                if (((CountDownLatch) this.f48028f.f4203c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f48024a.b(this, socket);
                ((CountDownLatch) this.f48028f.f4203c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c5.b0 b0Var = this.f48027e;
            if (b0Var != null) {
                ((CountDownLatch) b0Var.f4203c).await(b0Var.f4202b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f48024a;
            synchronized (hVar) {
                if (((Socket) hVar.f48002c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f48025b.createSocket();
                int i10 = r.f48017a;
                socket.connect(this.f48026c, this.d);
                b(socket);
            }
        } catch (Exception e7) {
            a(e7);
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
