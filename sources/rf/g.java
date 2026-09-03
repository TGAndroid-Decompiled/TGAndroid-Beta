package rf;

import o2.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f43492a;
    public final j f43493b;

    public g(j jVar, int i10) {
        this.f43492a = i10;
        this.f43493b = jVar;
    }

    private final void a() {
        j jVar = this.f43493b;
        jVar.e();
        synchronized (jVar.f43499a) {
            try {
                if (jVar.f43511p) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(jVar, 1), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        o2.f fVar;
        byte[] bArr;
        switch (this.f43492a) {
            case 0:
                j jVar = this.f43493b;
                o2.f fVar2 = jVar.f43509n;
                if (fVar2 != null) {
                    try {
                        if (l.f16198c.b()) {
                            fVar2.f16191a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                jVar.e();
                return;
            case 1:
                j.a(this.f43493b);
                return;
            case 2:
                j.b(this.f43493b);
                return;
            case 3:
                a();
                return;
            default:
                j jVar2 = this.f43493b;
                while (true) {
                    synchronized (jVar2.f43499a) {
                        fVar = jVar2.f43509n;
                        if (!jVar2.f43511p && fVar != null && !jVar2.f43507l.isEmpty()) {
                            bArr = (byte[]) jVar2.f43507l.removeFirst();
                            jVar2.f43513r -= bArr.length;
                        }
                    }
                    try {
                        if (l.f16196a.b()) {
                            fVar.f16191a.postMessageWithPayload(new ee.a(new o2.h(bArr)));
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        jVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
