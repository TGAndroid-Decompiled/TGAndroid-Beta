package org.telegram.ui;
public final class vi0 implements Runnable {
    public final int f42275a;
    public final bj0 f42276b;

    public vi0(bj0 bj0Var, int i10) {
        this.f42275a = i10;
        this.f42276b = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f42275a) {
            case 0:
                this.f42276b.dismiss();
                return;
            case 1:
                this.f42276b.V(true, false);
                return;
            default:
                this.f42276b.V(true, false);
                return;
        }
    }
}
