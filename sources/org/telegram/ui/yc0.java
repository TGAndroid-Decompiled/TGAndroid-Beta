package org.telegram.ui;
public final class yc0 implements Runnable {
    public final int f52189a;
    public final gd0 f52190b;
    public final int f52191c;

    public yc0(gd0 gd0Var, int i7, int i10) {
        this.f52189a = i10;
        this.f52190b = gd0Var;
        this.f52191c = i7;
    }

    @Override
    public final void run() {
        switch (this.f52189a) {
            case 0:
                org.telegram.messenger.g0.h3(new yc0(this.f52190b, this.f52191c, 1));
                return;
            case 1:
                this.f52190b.z(this.f52191c);
                return;
            default:
                this.f52190b.f45936f.f52294f[this.f52191c].C(1.0f);
                return;
        }
    }
}
