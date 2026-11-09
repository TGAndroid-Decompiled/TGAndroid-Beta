package ui;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f56946a;
    public final i f56947b;

    public f(i iVar, int i7) {
        this.f56946a = i7;
        this.f56947b = iVar;
    }

    private final void a() {
        i iVar = this.f56947b;
        iVar.g();
        synchronized (iVar.f56954a) {
            try {
                if (iVar.f56972u) {
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
        throw new UnsupportedOperationException("Method not decompiled: ui.f.run():void");
    }
}
