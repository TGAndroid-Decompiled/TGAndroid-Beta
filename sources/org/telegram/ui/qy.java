package org.telegram.ui;
public final class qy implements Runnable {
    public final int f49214a;
    public final fi.m3 f49215b;

    public qy(fi.m3 m3Var, int i7) {
        this.f49214a = i7;
        this.f49215b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f49214a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f49215b);
                return;
            default:
                this.f49215b.f(true);
                return;
        }
    }
}
