package org.telegram.ui;
public final class xi0 implements Runnable {
    public final int f43153a;
    public final dj0 f43154b;

    public xi0(dj0 dj0Var, int i10) {
        this.f43153a = i10;
        this.f43154b = dj0Var;
    }

    @Override
    public final void run() {
        switch (this.f43153a) {
            case 0:
                this.f43154b.dismiss();
                return;
            case 1:
                this.f43154b.V(true, false);
                return;
            default:
                this.f43154b.V(true, false);
                return;
        }
    }
}
