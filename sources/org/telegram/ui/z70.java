package org.telegram.ui;
public final class z70 implements Runnable {
    public final int f40399a;
    public final g80 f40400b;

    public z70(g80 g80Var, int i10) {
        this.f40399a = i10;
        this.f40400b = g80Var;
    }

    @Override
    public final void run() {
        switch (this.f40399a) {
            case 0:
                g80 g80Var = this.f40400b;
                g80Var.h.postOnAnimation(new z70(g80Var, 1));
                return;
            default:
                this.f40400b.Y();
                return;
        }
    }
}
