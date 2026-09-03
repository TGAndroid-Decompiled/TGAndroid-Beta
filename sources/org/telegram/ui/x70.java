package org.telegram.ui;
public final class x70 implements Runnable {
    public final int f39913a;
    public final e80 f39914b;

    public x70(e80 e80Var, int i10) {
        this.f39913a = i10;
        this.f39914b = e80Var;
    }

    @Override
    public final void run() {
        switch (this.f39913a) {
            case 0:
                e80 e80Var = this.f39914b;
                e80Var.h.postOnAnimation(new x70(e80Var, 1));
                return;
            default:
                this.f39914b.Y();
                return;
        }
    }
}
