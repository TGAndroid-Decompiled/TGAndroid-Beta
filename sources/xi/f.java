package xi;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f60669a;
    public final i f60670b;

    public f(i iVar, int i7) {
        this.f60669a = i7;
        this.f60670b = iVar;
    }

    private final void a() {
        i iVar = this.f60670b;
        iVar.g();
        synchronized (iVar.f60677a) {
            try {
                if (iVar.f60695u) {
                    return;
                }
                g0.h3(new f(iVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: xi.f.run():void");
    }
}
