package tc;

import c5.c0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f45603a;
    public final SocketFactory f45604b;
    public final InetSocketAddress f45605c;
    public final int d;
    public final c0 e;
    public final c0 f45606f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c0 c0Var, c0 c0Var2) {
        this.f45603a = hVar;
        this.f45604b = socketFactory;
        this.f45605c = inetSocketAddress;
        this.d = i10;
        this.e = c0Var;
        this.f45606f = c0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f45603a) {
            try {
                if (((CountDownLatch) this.f45606f.f4353c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f45603a.a(exc);
                ((CountDownLatch) this.f45606f.f4353c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f45603a) {
            try {
                if (((CountDownLatch) this.f45606f.f4353c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f45603a.b(this, socket);
                ((CountDownLatch) this.f45606f.f4353c).countDown();
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
                ((CountDownLatch) c0Var.f4353c).await(c0Var.f4352b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f45603a;
            synchronized (hVar) {
                if (((Socket) hVar.f45584c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f45604b.createSocket();
                int i10 = r.f45597a;
                socket.connect(this.f45605c, this.d);
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
