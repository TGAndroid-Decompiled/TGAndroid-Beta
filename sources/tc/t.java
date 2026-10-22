package tc;

import c5.c0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f46972a;
    public final SocketFactory f46973b;
    public final InetSocketAddress f46974c;
    public final int d;
    public final c0 e;
    public final c0 f46975f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c0 c0Var, c0 c0Var2) {
        this.f46972a = hVar;
        this.f46973b = socketFactory;
        this.f46974c = inetSocketAddress;
        this.d = i10;
        this.e = c0Var;
        this.f46975f = c0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f46972a) {
            try {
                if (((CountDownLatch) this.f46975f.f4724c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f46972a.a(exc);
                ((CountDownLatch) this.f46975f.f4724c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f46972a) {
            try {
                if (((CountDownLatch) this.f46975f.f4724c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f46972a.b(this, socket);
                ((CountDownLatch) this.f46975f.f4724c).countDown();
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
                ((CountDownLatch) c0Var.f4724c).await(c0Var.f4723b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f46972a;
            synchronized (hVar) {
                if (((Socket) hVar.f46953c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f46973b.createSocket();
                int i10 = r.f46966a;
                socket.connect(this.f46974c, this.d);
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
