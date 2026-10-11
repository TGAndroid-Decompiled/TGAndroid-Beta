package pi;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f45975a;
    public final k f45976b;

    public g(k kVar, int i10) {
        this.f45975a = i10;
        this.f45976b = kVar;
    }

    private final void a() {
        k kVar = this.f45976b;
        kVar.e();
        synchronized (kVar.f45986a) {
            try {
                if (kVar.f46004u) {
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
