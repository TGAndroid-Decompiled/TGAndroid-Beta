package sc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f47932a;
    public final SocketFactory f47933b;
    public final InetSocketAddress f47934c;
    public final int d;
    public final c5.b0 f47935e;
    public final c5.b0 f47936f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c5.b0 b0Var, c5.b0 b0Var2) {
        this.f47932a = hVar;
        this.f47933b = socketFactory;
        this.f47934c = inetSocketAddress;
        this.d = i10;
        this.f47935e = b0Var;
        this.f47936f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f47932a) {
            try {
                if (((CountDownLatch) this.f47936f.f4204c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47932a.a(exc);
                ((CountDownLatch) this.f47936f.f4204c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f47932a) {
            try {
                if (((CountDownLatch) this.f47936f.f4204c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47932a.b(this, socket);
                ((CountDownLatch) this.f47936f.f4204c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c5.b0 b0Var = this.f47935e;
            if (b0Var != null) {
                ((CountDownLatch) b0Var.f4204c).await(b0Var.f4203b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f47932a;
            synchronized (hVar) {
                if (((Socket) hVar.f47910c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f47933b.createSocket();
                int i10 = r.f47925a;
                socket.connect(this.f47934c, this.d);
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
