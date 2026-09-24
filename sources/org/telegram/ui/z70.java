package org.telegram.ui;
public final class z70 implements Runnable {
    public final int f40383a;
    public final g80 f40384b;

    public z70(g80 g80Var, int i10) {
        this.f40383a = i10;
        this.f40384b = g80Var;
    }

    @Override
    public final void run() {
        switch (this.f40383a) {
            case 0:
                g80 g80Var = this.f40384b;
                g80Var.h.postOnAnimation(new z70(g80Var, 1));
                return;
            default:
                this.f40384b.Y();
                return;
        }
    }
}
