package org.telegram.ui;
public final class v70 implements Runnable {
    public final int f39092a;
    public final c80 f39093b;

    public v70(c80 c80Var, int i10) {
        this.f39092a = i10;
        this.f39093b = c80Var;
    }

    @Override
    public final void run() {
        switch (this.f39092a) {
            case 0:
                c80 c80Var = this.f39093b;
                c80Var.h.postOnAnimation(new v70(c80Var, 1));
                return;
            default:
                this.f39093b.Y();
                return;
        }
    }
}
