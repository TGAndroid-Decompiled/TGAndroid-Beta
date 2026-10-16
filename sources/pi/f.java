package pi;

import org.telegram.messenger.AndroidUtilities;
public final class f implements Runnable {
    public final int f42947a;
    public final j f42948b;

    public f(j jVar, int i10) {
        this.f42947a = i10;
        this.f42948b = jVar;
    }

    private final void a() {
        j jVar = this.f42948b;
        jVar.e();
        synchronized (jVar.f42957a) {
            try {
                if (jVar.f42974u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new f(jVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: pi.f.run():void");
    }
}
