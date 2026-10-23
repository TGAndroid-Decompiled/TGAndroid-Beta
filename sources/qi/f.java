package qi;

import org.telegram.messenger.AndroidUtilities;
public final class f implements Runnable {
    public final int f45179a;
    public final i f45180b;

    public f(i iVar, int i10) {
        this.f45179a = i10;
        this.f45180b = iVar;
    }

    private final void a() {
        i iVar = this.f45180b;
        iVar.e();
        synchronized (iVar.f45186a) {
            try {
                if (iVar.f45203u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new f(iVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: qi.f.run():void");
    }
}
