package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f55963a;
    public final SocketFactory f55964b;
    public final InetSocketAddress f55965c;
    public final int d;
    public final f5.v f55966e;
    public final f5.v f55967f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, f5.v vVar, f5.v vVar2) {
        this.f55963a = hVar;
        this.f55964b = socketFactory;
        this.f55965c = inetSocketAddress;
        this.d = i7;
        this.f55966e = vVar;
        this.f55967f = vVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f55963a) {
            try {
                if (((CountDownLatch) this.f55967f.f11019c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f55963a.a(exc);
                ((CountDownLatch) this.f55967f.f11019c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f55963a) {
            try {
                if (((CountDownLatch) this.f55967f.f11019c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f55963a.b(this, socket);
                ((CountDownLatch) this.f55967f.f11019c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            f5.v vVar = this.f55966e;
            if (vVar != null) {
                ((CountDownLatch) vVar.f11019c).await(vVar.f11018b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f55963a;
            synchronized (hVar) {
                if (((Socket) hVar.f55941c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f55964b.createSocket();
                int i7 = r.f55956a;
                socket.connect(this.f55965c, this.d);
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
