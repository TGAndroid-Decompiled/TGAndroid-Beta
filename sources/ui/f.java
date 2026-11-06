package ui;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f56842a;
    public final i f56843b;

    public f(i iVar, int i7) {
        this.f56842a = i7;
        this.f56843b = iVar;
    }

    private final void a() {
        i iVar = this.f56843b;
        iVar.g();
        synchronized (iVar.f56850a) {
            try {
                if (iVar.f56868u) {
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
