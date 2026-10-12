package sc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f48165a;
    public final SocketFactory f48166b;
    public final InetSocketAddress f48167c;
    public final int d;
    public final c5.b0 f48168e;
    public final c5.b0 f48169f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c5.b0 b0Var, c5.b0 b0Var2) {
        this.f48165a = hVar;
        this.f48166b = socketFactory;
        this.f48167c = inetSocketAddress;
        this.d = i10;
        this.f48168e = b0Var;
        this.f48169f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f48165a) {
            try {
                if (((CountDownLatch) this.f48169f.f4202c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f48165a.a(exc);
                ((CountDownLatch) this.f48169f.f4202c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f48165a) {
            try {
                if (((CountDownLatch) this.f48169f.f4202c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f48165a.b(this, socket);
                ((CountDownLatch) this.f48169f.f4202c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c5.b0 b0Var = this.f48168e;
            if (b0Var != null) {
                ((CountDownLatch) b0Var.f4202c).await(b0Var.f4201b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f48165a;
            synchronized (hVar) {
                if (((Socket) hVar.f48143c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f48166b.createSocket();
                int i10 = r.f48158a;
                socket.connect(this.f48167c, this.d);
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
