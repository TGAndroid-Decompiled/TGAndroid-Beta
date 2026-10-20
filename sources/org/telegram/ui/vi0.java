package org.telegram.ui;
public final class vi0 implements Runnable {
    public final int f42271a;
    public final bj0 f42272b;

    public vi0(bj0 bj0Var, int i10) {
        this.f42271a = i10;
        this.f42272b = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f42271a) {
            case 0:
                this.f42272b.dismiss();
                return;
            case 1:
                this.f42272b.V(true, false);
                return;
            default:
                this.f42272b.V(true, false);
                return;
        }
    }
}
