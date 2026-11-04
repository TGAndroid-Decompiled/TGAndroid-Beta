package ui;

import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f56393a;
    public final j f56394b;

    public g(j jVar, int i3) {
        this.f56393a = i3;
        this.f56394b = jVar;
    }

    private final void a() {
        j jVar = this.f56394b;
        jVar.g();
        synchronized (jVar.f56401a) {
            try {
                if (jVar.f56419u) {
                    return;
                }
                g0.i3(new g(jVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ui.g.run():void");
    }
}
