package tc;

import c5.b0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f46990a;
    public final SocketFactory f46991b;
    public final InetSocketAddress f46992c;
    public final int d;
    public final b0 e;
    public final b0 f46993f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, b0 b0Var, b0 b0Var2) {
        this.f46990a = hVar;
        this.f46991b = socketFactory;
        this.f46992c = inetSocketAddress;
        this.d = i10;
        this.e = b0Var;
        this.f46993f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f46990a) {
            try {
                if (((CountDownLatch) this.f46993f.f4703c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f46990a.a(exc);
                ((CountDownLatch) this.f46993f.f4703c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f46990a) {
            try {
                if (((CountDownLatch) this.f46993f.f4703c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f46990a.b(this, socket);
                ((CountDownLatch) this.f46993f.f4703c).countDown();
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
                ((CountDownLatch) b0Var.f4703c).await(b0Var.f4702b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f46990a;
            synchronized (hVar) {
                if (((Socket) hVar.f46971c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f46991b.createSocket();
                int i10 = r.f46984a;
                socket.connect(this.f46992c, this.d);
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
