package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f54387a;
    public final SocketFactory f54388b;
    public final InetSocketAddress f54389c;
    public final int d;
    public final f5.u f54390e;
    public final f5.u f54391f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, f5.u uVar, f5.u uVar2) {
        this.f54387a = hVar;
        this.f54388b = socketFactory;
        this.f54389c = inetSocketAddress;
        this.d = i7;
        this.f54390e = uVar;
        this.f54391f = uVar2;
    }

    public final void a(Exception exc) {
        boolean z9;
        synchronized (this.f54387a) {
            try {
                if (((CountDownLatch) this.f54391f.f11191c).getCount() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return;
                }
                this.f54387a.a(exc);
                ((CountDownLatch) this.f54391f.f11191c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z9;
        synchronized (this.f54387a) {
            try {
                if (((CountDownLatch) this.f54391f.f11191c).getCount() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return;
                }
                this.f54387a.b(this, socket);
                ((CountDownLatch) this.f54391f.f11191c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z9;
        Socket socket = null;
        try {
            f5.u uVar = this.f54390e;
            if (uVar != null) {
                ((CountDownLatch) uVar.f11191c).await(uVar.f11190b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f54387a;
            synchronized (hVar) {
                if (((Socket) hVar.f54365c) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (!z9) {
                socket = this.f54388b.createSocket();
                int i7 = r.f54380a;
                socket.connect(this.f54389c, this.d);
                b(socket);
            }
        } catch (Exception e10) {
            a(e10);
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
