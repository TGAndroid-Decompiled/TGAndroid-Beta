package sc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f48173a;
    public final SocketFactory f48174b;
    public final InetSocketAddress f48175c;
    public final int d;
    public final c5.b0 f48176e;
    public final c5.b0 f48177f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c5.b0 b0Var, c5.b0 b0Var2) {
        this.f48173a = hVar;
        this.f48174b = socketFactory;
        this.f48175c = inetSocketAddress;
        this.d = i10;
        this.f48176e = b0Var;
        this.f48177f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f48173a) {
            try {
                if (((CountDownLatch) this.f48177f.f4202c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f48173a.a(exc);
                ((CountDownLatch) this.f48177f.f4202c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f48173a) {
            try {
                if (((CountDownLatch) this.f48177f.f4202c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f48173a.b(this, socket);
                ((CountDownLatch) this.f48177f.f4202c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c5.b0 b0Var = this.f48176e;
            if (b0Var != null) {
                ((CountDownLatch) b0Var.f4202c).await(b0Var.f4201b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f48173a;
            synchronized (hVar) {
                if (((Socket) hVar.f48151c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f48174b.createSocket();
                int i10 = r.f48166a;
                socket.connect(this.f48175c, this.d);
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
