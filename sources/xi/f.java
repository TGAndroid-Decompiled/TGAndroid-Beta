package xi;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f60624a;
    public final i f60625b;

    public f(i iVar, int i7) {
        this.f60624a = i7;
        this.f60625b = iVar;
    }

    private final void a() {
        i iVar = this.f60625b;
        iVar.g();
        synchronized (iVar.f60632a) {
            try {
                if (iVar.f60650u) {
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
