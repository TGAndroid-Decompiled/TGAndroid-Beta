package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f54479a;
    public final SocketFactory f54480b;
    public final InetSocketAddress f54481c;
    public final int d;
    public final f5.u f54482e;
    public final f5.u f54483f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, f5.u uVar, f5.u uVar2) {
        this.f54479a = hVar;
        this.f54480b = socketFactory;
        this.f54481c = inetSocketAddress;
        this.d = i7;
        this.f54482e = uVar;
        this.f54483f = uVar2;
    }

    public final void a(Exception exc) {
        boolean z9;
        synchronized (this.f54479a) {
            try {
                if (((CountDownLatch) this.f54483f.f11191c).getCount() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return;
                }
                this.f54479a.a(exc);
                ((CountDownLatch) this.f54483f.f11191c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z9;
        synchronized (this.f54479a) {
            try {
                if (((CountDownLatch) this.f54483f.f11191c).getCount() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return;
                }
                this.f54479a.b(this, socket);
                ((CountDownLatch) this.f54483f.f11191c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z9;
        Socket socket = null;
        try {
            f5.u uVar = this.f54482e;
            if (uVar != null) {
                ((CountDownLatch) uVar.f11191c).await(uVar.f11190b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f54479a;
            synchronized (hVar) {
                if (((Socket) hVar.f54457c) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (!z9) {
                socket = this.f54480b.createSocket();
                int i7 = r.f54472a;
                socket.connect(this.f54481c, this.d);
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
