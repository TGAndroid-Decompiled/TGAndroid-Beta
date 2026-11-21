package xi;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f60665a;
    public final i f60666b;

    public f(i iVar, int i7) {
        this.f60665a = i7;
        this.f60666b = iVar;
    }

    private final void a() {
        i iVar = this.f60666b;
        iVar.g();
        synchronized (iVar.f60673a) {
            try {
                if (iVar.f60691u) {
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
