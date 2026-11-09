package rc;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class h {
    public static final String[] f54465e = {"Connection", "Upgrade"};
    public static final String[] f54466f = {"Upgrade", "websocket"};
    public static final String[] f54467g = {"Sec-WebSocket-Version", "13"};
    public Object f54468a;
    public Serializable f54469b;
    public Object f54470c;
    public Serializable d;

    public synchronized void a(Exception exc) {
        try {
            CountDownLatch countDownLatch = (CountDownLatch) this.f54468a;
            if (countDownLatch != null && ((ArrayList) this.f54469b) != null) {
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
        if (((CountDownLatch) this.f54468a) != null && (arrayList = (ArrayList) this.f54469b) != null) {
            if (((Socket) this.f54470c) == null) {
                this.f54470c = socket;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
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
            ((CountDownLatch) this.f54468a).countDown();
        } else {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
    }
}
