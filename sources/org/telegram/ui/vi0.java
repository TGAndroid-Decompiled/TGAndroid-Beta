package org.telegram.ui;
public final class vi0 implements Runnable {
    public final int f42265a;
    public final bj0 f42266b;

    public vi0(bj0 bj0Var, int i10) {
        this.f42265a = i10;
        this.f42266b = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f42265a) {
            case 0:
                this.f42266b.dismiss();
                return;
            case 1:
                this.f42266b.V(true, false);
                return;
            default:
                this.f42266b.V(true, false);
                return;
        }
    }
}
