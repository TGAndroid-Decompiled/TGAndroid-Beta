package org.telegram.ui;
public final class xi0 implements Runnable {
    public final int f43173a;
    public final dj0 f43174b;

    public xi0(dj0 dj0Var, int i10) {
        this.f43173a = i10;
        this.f43174b = dj0Var;
    }

    @Override
    public final void run() {
        switch (this.f43173a) {
            case 0:
                this.f43174b.dismiss();
                return;
            case 1:
                this.f43174b.V(true, false);
                return;
            default:
                this.f43174b.V(true, false);
                return;
        }
    }
}
