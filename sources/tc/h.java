package tc;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class h {
    public static final String[] e = {"Connection", "Upgrade"};
    public static final String[] f46941f = {"Upgrade", "websocket"};
    public static final String[] f46942g = {"Sec-WebSocket-Version", "13"};
    public Object f46943a;
    public Serializable f46944b;
    public Object f46945c;
    public Serializable d;

    public synchronized void a(Exception exc) {
        try {
            CountDownLatch countDownLatch = (CountDownLatch) this.f46943a;
            if (countDownLatch != null && ((ArrayList) this.f46944b) != null) {
                if (((Exception) this.d) == null) {
                    this.d = exc;
                }
                countDownLatch.countDown();
            } else {
                throw new IllegalStateException("Cannot set exception before awaiting!");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(t tVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.f46943a) != null && (arrayList = (ArrayList) this.f46944b) != null) {
            if (((Socket) this.f46945c) == null) {
                this.f46945c = socket;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    t tVar2 = (t) obj;
                    if (tVar2 != tVar) {
                        tVar2.a(new InterruptedException());
                        tVar2.interrupt();
                    }
                }
            } else {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
            ((CountDownLatch) this.f46943a).countDown();
        } else {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
    }
}
