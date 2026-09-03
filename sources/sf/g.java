package sf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f47354a;
    public final k f47355b;

    public g(k kVar, int i10) {
        this.f47354a = i10;
        this.f47355b = kVar;
    }

    private final void a() {
        k kVar = this.f47355b;
        kVar.e();
        synchronized (kVar.f47364a) {
            try {
                if (kVar.f47377p) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 1), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        o2.f fVar;
        byte[] bArr;
        switch (this.f47354a) {
            case 0:
                k kVar = this.f47355b;
                o2.f fVar2 = kVar.f47375n;
                if (fVar2 != null) {
                    try {
                        if (o2.k.f16358c.b()) {
                            fVar2.f16352a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.a(this.f47355b);
                return;
            case 2:
                k.b(this.f47355b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f47355b;
                while (true) {
                    synchronized (kVar2.f47364a) {
                        fVar = kVar2.f47375n;
                        if (!kVar2.f47377p && fVar != null && !kVar2.f47373l.isEmpty()) {
                            bArr = (byte[]) kVar2.f47373l.removeFirst();
                            kVar2.f47379r -= bArr.length;
                        }
                    }
                    try {
                        if (o2.k.f16356a.b()) {
                            fVar.f16352a.postMessageWithPayload(new ee.a(new o2.h(bArr)));
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        kVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
