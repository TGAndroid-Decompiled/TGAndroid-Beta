package org.telegram.ui;
public final class yc0 implements Runnable {
    public final int f54161a;
    public final gd0 f54162b;
    public final int f54163c;

    public yc0(gd0 gd0Var, int i7, int i10) {
        this.f54161a = i10;
        this.f54162b = gd0Var;
        this.f54163c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54161a) {
            case 0:
                org.telegram.messenger.g0.g3(new yc0(this.f54162b, this.f54163c, 1));
                return;
            case 1:
                this.f54162b.z(this.f54163c);
                return;
            default:
                this.f54162b.f48065f.f46301f[this.f54163c].D(1.0f);
                return;
        }
    }
}
