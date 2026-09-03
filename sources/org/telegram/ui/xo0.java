package org.telegram.ui;
public final class xo0 implements Runnable {
    public final int f43421a;
    public final hp0 f43422b;

    public xo0(hp0 hp0Var, int i10) {
        this.f43421a = i10;
        this.f43422b = hp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f43421a;
        hp0 hp0Var = this.f43422b;
        switch (i10) {
            case 0:
                if (hp0Var.D) {
                    hp0Var.f37443b.invalidate();
                    return;
                }
                return;
            case 1:
                hp0Var.h();
                return;
            case 2:
                int i11 = hp0.f37440n0;
                hp0Var.h();
                return;
            default:
                int i12 = hp0.f37440n0;
                hp0Var.h();
                return;
        }
    }
}
