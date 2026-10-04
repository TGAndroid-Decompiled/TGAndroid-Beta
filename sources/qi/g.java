package qi;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f45530a;
    public final j f45531b;

    public g(j jVar, int i10) {
        this.f45530a = i10;
        this.f45531b = jVar;
    }

    private final void a() {
        j jVar = this.f45531b;
        jVar.e();
        synchronized (jVar.f45538a) {
            try {
                if (jVar.f45556u) {
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
        throw new UnsupportedOperationException("Method not decompiled: qi.g.run():void");
    }
}
