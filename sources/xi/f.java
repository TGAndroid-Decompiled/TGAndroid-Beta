package xi;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f60058a;
    public final i f60059b;

    public f(i iVar, int i7) {
        this.f60058a = i7;
        this.f60059b = iVar;
    }

    private final void a() {
        i iVar = this.f60059b;
        iVar.g();
        synchronized (iVar.f60066a) {
            try {
                if (iVar.f60084u) {
                    return;
                }
                g0.i3(new f(iVar, 2), 1000L);
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
