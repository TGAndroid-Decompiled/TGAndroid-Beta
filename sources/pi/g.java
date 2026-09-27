package pi;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f41368a;
    public final j f41369b;

    public g(j jVar, int i10) {
        this.f41368a = i10;
        this.f41369b = jVar;
    }

    private final void a() {
        j jVar = this.f41369b;
        jVar.e();
        synchronized (jVar.f41375a) {
            try {
                if (jVar.f41389r) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(jVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        b5.h hVar;
        byte[] bArr;
        switch (this.f41368a) {
            case 0:
                j jVar = this.f41369b;
                b5.h hVar2 = jVar.f41387p;
                if (hVar2 != null) {
                    try {
                        if (m.f3420c.b()) {
                            hVar2.f3415a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                jVar.e();
                return;
            case 1:
                j.b(this.f41369b);
                return;
            case 2:
                j.a(this.f41369b);
                return;
            case 3:
                a();
                return;
            default:
                j jVar2 = this.f41369b;
                while (true) {
                    synchronized (jVar2.f41375a) {
                        hVar = jVar2.f41387p;
                        if (!jVar2.f41389r && hVar != null && !jVar2.f41385n.isEmpty()) {
                            bArr = (byte[]) jVar2.f41385n.removeFirst();
                            jVar2.f41391t -= bArr.length;
                        }
                    }
                    try {
                        if (m.f3418a.b()) {
                            hVar.f3415a.postMessageWithPayload(new se.a(new b5.j(bArr)));
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
