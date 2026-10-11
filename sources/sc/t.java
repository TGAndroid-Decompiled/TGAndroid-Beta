package sc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f48058a;
    public final SocketFactory f48059b;
    public final InetSocketAddress f48060c;
    public final int d;
    public final c5.b0 f48061e;
    public final c5.b0 f48062f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c5.b0 b0Var, c5.b0 b0Var2) {
        this.f48058a = hVar;
        this.f48059b = socketFactory;
        this.f48060c = inetSocketAddress;
        this.d = i10;
        this.f48061e = b0Var;
        this.f48062f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f48058a) {
            try {
                if (((CountDownLatch) this.f48062f.f4203c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f48058a.a(exc);
                ((CountDownLatch) this.f48062f.f4203c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f48058a) {
            try {
                if (((CountDownLatch) this.f48062f.f4203c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f48058a.b(this, socket);
                ((CountDownLatch) this.f48062f.f4203c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c5.b0 b0Var = this.f48061e;
            if (b0Var != null) {
                ((CountDownLatch) b0Var.f4203c).await(b0Var.f4202b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f48058a;
            synchronized (hVar) {
                if (((Socket) hVar.f48036c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f48059b.createSocket();
                int i10 = r.f48051a;
                socket.connect(this.f48060c, this.d);
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
