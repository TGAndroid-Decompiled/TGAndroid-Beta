package uc;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class h {
    public static final String[] e = {"Connection", "Upgrade"};
    public static final String[] f49653f = {"Upgrade", "websocket"};
    public static final String[] f49654g = {"Sec-WebSocket-Version", "13"};
    public Object f49655a;
    public Serializable f49656b;
    public Object f49657c;
    public Serializable d;

    public synchronized void a(Exception exc) {
        try {
            CountDownLatch countDownLatch = (CountDownLatch) this.f49655a;
            if (countDownLatch != null && ((ArrayList) this.f49656b) != null) {
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
        if (((CountDownLatch) this.f49655a) != null && (arrayList = (ArrayList) this.f49656b) != null) {
            if (((Socket) this.f49657c) == null) {
                this.f49657c = socket;
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
            ((CountDownLatch) this.f49655a).countDown();
        } else {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
    }
}
