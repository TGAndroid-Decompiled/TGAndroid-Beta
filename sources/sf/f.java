package sf;

import o2.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f implements Runnable {
    public final int f47318a;
    public final j f47319b;

    public f(j jVar, int i10) {
        this.f47318a = i10;
        this.f47319b = jVar;
    }

    private final void a() {
        j jVar = this.f47319b;
        jVar.e();
        synchronized (jVar.f47328a) {
            try {
                if (jVar.f47341p) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new f(jVar, 1), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        o2.f fVar;
        byte[] bArr;
        switch (this.f47318a) {
            case 0:
                j jVar = this.f47319b;
                o2.f fVar2 = jVar.f47339n;
                if (fVar2 != null) {
                    try {
                        if (k.f16356c.b()) {
                            fVar2.f16350a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                jVar.e();
                return;
            case 1:
                j.a(this.f47319b);
                return;
            case 2:
                j.b(this.f47319b);
                return;
            case 3:
                a();
                return;
            default:
                j jVar2 = this.f47319b;
                while (true) {
                    synchronized (jVar2.f47328a) {
                        fVar = jVar2.f47339n;
                        if (!jVar2.f47341p && fVar != null && !jVar2.f47337l.isEmpty()) {
                            bArr = (byte[]) jVar2.f47337l.removeFirst();
                            jVar2.f47343r -= bArr.length;
                        }
                    }
                    try {
                        if (k.f16354a.b()) {
                            fVar.f16350a.postMessageWithPayload(new ee.a(new o2.h(bArr)));
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        jVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
