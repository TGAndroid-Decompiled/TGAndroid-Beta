package org.telegram.ui;
public final class yc0 implements Runnable {
    public final int f54137a;
    public final gd0 f54138b;
    public final int f54139c;

    public yc0(gd0 gd0Var, int i7, int i10) {
        this.f54137a = i10;
        this.f54138b = gd0Var;
        this.f54139c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54137a) {
            case 0:
                org.telegram.messenger.g0.g3(new yc0(this.f54138b, this.f54139c, 1));
                return;
            case 1:
                this.f54138b.z(this.f54139c);
                return;
            default:
                this.f54138b.f48009f.f46275f[this.f54139c].D(1.0f);
                return;
        }
    }
}
