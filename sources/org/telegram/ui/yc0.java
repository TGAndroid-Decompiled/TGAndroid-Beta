package org.telegram.ui;
public final class yc0 implements Runnable {
    public final int f52195a;
    public final gd0 f52196b;
    public final int f52197c;

    public yc0(gd0 gd0Var, int i7, int i10) {
        this.f52195a = i10;
        this.f52196b = gd0Var;
        this.f52197c = i7;
    }

    @Override
    public final void run() {
        switch (this.f52195a) {
            case 0:
                org.telegram.messenger.g0.h3(new yc0(this.f52196b, this.f52197c, 1));
                return;
            case 1:
                this.f52196b.z(this.f52197c);
                return;
            default:
                this.f52196b.f45964f.f52289f[this.f52197c].C(1.0f);
                return;
        }
    }
}
