package org.telegram.ui;
public final class z70 implements Runnable {
    public final int f40400a;
    public final g80 f40401b;

    public z70(g80 g80Var, int i10) {
        this.f40400a = i10;
        this.f40401b = g80Var;
    }

    @Override
    public final void run() {
        switch (this.f40400a) {
            case 0:
                g80 g80Var = this.f40401b;
                g80Var.h.postOnAnimation(new z70(g80Var, 1));
                return;
            default:
                this.f40401b.Y();
                return;
        }
    }
}
