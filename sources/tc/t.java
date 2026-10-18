package tc;

import c5.b0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f47012a;
    public final SocketFactory f47013b;
    public final InetSocketAddress f47014c;
    public final int d;
    public final b0 e;
    public final b0 f47015f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, b0 b0Var, b0 b0Var2) {
        this.f47012a = hVar;
        this.f47013b = socketFactory;
        this.f47014c = inetSocketAddress;
        this.d = i10;
        this.e = b0Var;
        this.f47015f = b0Var2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f47012a) {
            try {
                if (((CountDownLatch) this.f47015f.f4704c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47012a.a(exc);
                ((CountDownLatch) this.f47015f.f4704c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f47012a) {
            try {
                if (((CountDownLatch) this.f47015f.f4704c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f47012a.b(this, socket);
                ((CountDownLatch) this.f47015f.f4704c).countDown();
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
            h hVar = this.f47012a;
            synchronized (hVar) {
                if (((Socket) hVar.f46993c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f47013b.createSocket();
                int i10 = r.f47006a;
                socket.connect(this.f47014c, this.d);
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
