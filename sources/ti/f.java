package ti;

import org.telegram.messenger.AndroidUtilities;
public final class f implements Runnable {
    public final int f49186a;
    public final j f49187b;

    public f(j jVar, int i10) {
        this.f49186a = i10;
        this.f49187b = jVar;
    }

    private final void a() {
        j jVar = this.f49187b;
        jVar.e();
        synchronized (jVar.f49195a) {
            try {
                if (jVar.f49212u) {
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
        throw new UnsupportedOperationException("Method not decompiled: ti.f.run():void");
    }
}
