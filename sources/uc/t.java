package uc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f49714a;
    public final SocketFactory f49715b;
    public final InetSocketAddress f49716c;
    public final int d;
    public final d5.z e;
    public final d5.z f49717f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, d5.z zVar, d5.z zVar2) {
        this.f49714a = hVar;
        this.f49715b = socketFactory;
        this.f49716c = inetSocketAddress;
        this.d = i10;
        this.e = zVar;
        this.f49717f = zVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f49714a) {
            try {
                if (((CountDownLatch) this.f49717f.f8027c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f49714a.a(exc);
                ((CountDownLatch) this.f49717f.f8027c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f49714a) {
            try {
                if (((CountDownLatch) this.f49717f.f8027c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f49714a.b(this, socket);
                ((CountDownLatch) this.f49717f.f8027c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            d5.z zVar = this.e;
            if (zVar != null) {
                ((CountDownLatch) zVar.f8027c).await(zVar.f8026b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f49714a;
            synchronized (hVar) {
                if (((Socket) hVar.f49695c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f49715b.createSocket();
                int i10 = r.f49708a;
                socket.connect(this.f49716c, this.d);
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
