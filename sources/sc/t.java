package sc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f47978a;
    public final SocketFactory f47979b;
    public final InetSocketAddress f47980c;
    public final int d;
    public final c5.b0 f47981e;
    public final c5.b0 f47982f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c5.b0 b0Var, c5.b0 b0Var2) {
        this.f47978a = hVar;
        this.f47979b = socketFactory;
        this.f47980c = inetSocketAddress;
        this.d = i10;
        this.f47981e = b0Var;
        this.f47982f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f47978a) {
            try {
                if (((CountDownLatch) this.f47982f.f4204c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47978a.a(exc);
                ((CountDownLatch) this.f47982f.f4204c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f47978a) {
            try {
                if (((CountDownLatch) this.f47982f.f4204c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47978a.b(this, socket);
                ((CountDownLatch) this.f47982f.f4204c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c5.b0 b0Var = this.f47981e;
            if (b0Var != null) {
                ((CountDownLatch) b0Var.f4204c).await(b0Var.f4203b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f47978a;
            synchronized (hVar) {
                if (((Socket) hVar.f47956c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f47979b.createSocket();
                int i10 = r.f47971a;
                socket.connect(this.f47980c, this.d);
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
