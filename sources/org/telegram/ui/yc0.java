package org.telegram.ui;
public final class yc0 implements Runnable {
    public final int f52210a;
    public final gd0 f52211b;
    public final int f52212c;

    public yc0(gd0 gd0Var, int i7, int i10) {
        this.f52210a = i10;
        this.f52211b = gd0Var;
        this.f52212c = i7;
    }

    @Override
    public final void run() {
        switch (this.f52210a) {
            case 0:
                org.telegram.messenger.g0.h3(new yc0(this.f52211b, this.f52212c, 1));
                return;
            case 1:
                this.f52211b.z(this.f52212c);
                return;
            default:
                this.f52211b.f45963f.f52311f[this.f52212c].C(1.0f);
                return;
        }
    }
}
