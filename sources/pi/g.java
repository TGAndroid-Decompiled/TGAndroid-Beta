package pi;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f45941a;
    public final k f45942b;

    public g(k kVar, int i10) {
        this.f45941a = i10;
        this.f45942b = kVar;
    }

    private final void a() {
        k kVar = this.f45942b;
        kVar.e();
        synchronized (kVar.f45952a) {
            try {
                if (kVar.f45970u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: pi.g.run():void");
    }
}
