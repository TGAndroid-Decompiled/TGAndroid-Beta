package org.telegram.ui;
public final class t51 implements Runnable {
    public final int f42554a;
    public final u51 f42555b;

    public t51(u51 u51Var, int i10) {
        this.f42554a = i10;
        this.f42555b = u51Var;
    }

    @Override
    public final void run() {
        switch (this.f42554a) {
            case 0:
                u51.a(this.f42555b);
                return;
            default:
                this.f42555b.dismiss();
                return;
        }
    }
}
