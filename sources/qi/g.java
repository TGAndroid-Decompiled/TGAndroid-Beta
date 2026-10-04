package qi;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f45529a;
    public final j f45530b;

    public g(j jVar, int i10) {
        this.f45529a = i10;
        this.f45530b = jVar;
    }

    private final void a() {
        j jVar = this.f45530b;
        jVar.e();
        synchronized (jVar.f45537a) {
            try {
                if (jVar.f45555u) {
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
