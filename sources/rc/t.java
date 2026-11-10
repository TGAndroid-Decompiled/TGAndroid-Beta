package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f54491a;
    public final SocketFactory f54492b;
    public final InetSocketAddress f54493c;
    public final int d;
    public final f5.u f54494e;
    public final f5.u f54495f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, f5.u uVar, f5.u uVar2) {
        this.f54491a = hVar;
        this.f54492b = socketFactory;
        this.f54493c = inetSocketAddress;
        this.d = i7;
        this.f54494e = uVar;
        this.f54495f = uVar2;
    }

    public final void a(Exception exc) {
        boolean z9;
        synchronized (this.f54491a) {
            try {
                if (((CountDownLatch) this.f54495f.f11196c).getCount() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return;
                }
                this.f54491a.a(exc);
                ((CountDownLatch) this.f54495f.f11196c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z9;
        synchronized (this.f54491a) {
            try {
                if (((CountDownLatch) this.f54495f.f11196c).getCount() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return;
                }
                this.f54491a.b(this, socket);
                ((CountDownLatch) this.f54495f.f11196c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z9;
        Socket socket = null;
        try {
            f5.u uVar = this.f54494e;
            if (uVar != null) {
                ((CountDownLatch) uVar.f11196c).await(uVar.f11195b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f54491a;
            synchronized (hVar) {
                if (((Socket) hVar.f54469c) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (!z9) {
                socket = this.f54492b.createSocket();
                int i7 = r.f54484a;
                socket.connect(this.f54493c, this.d);
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
