package org.telegram.ui;
public final class xo0 implements Runnable {
    public final int f40037a;
    public final hp0 f40038b;

    public xo0(hp0 hp0Var, int i10) {
        this.f40037a = i10;
        this.f40038b = hp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40037a;
        hp0 hp0Var = this.f40038b;
        switch (i10) {
            case 0:
                if (hp0Var.D) {
                    hp0Var.f34720b.invalidate();
                    return;
                }
                return;
            case 1:
                hp0Var.h();
                return;
            case 2:
                int i11 = hp0.f34717n0;
                hp0Var.h();
                return;
            default:
                int i12 = hp0.f34717n0;
                hp0Var.h();
                return;
        }
    }
}
