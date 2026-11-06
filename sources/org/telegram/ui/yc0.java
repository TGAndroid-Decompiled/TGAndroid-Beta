package org.telegram.ui;
public final class yc0 implements Runnable {
    public final int f52208a;
    public final gd0 f52209b;
    public final int f52210c;

    public yc0(gd0 gd0Var, int i7, int i10) {
        this.f52208a = i10;
        this.f52209b = gd0Var;
        this.f52210c = i7;
    }

    @Override
    public final void run() {
        switch (this.f52208a) {
            case 0:
                org.telegram.messenger.g0.h3(new yc0(this.f52209b, this.f52210c, 1));
                return;
            case 1:
                this.f52209b.z(this.f52210c);
                return;
            default:
                this.f52209b.f45962f.f52309f[this.f52210c].C(1.0f);
                return;
        }
    }
}
