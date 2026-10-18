package org.telegram.ui;
public final class rz implements Runnable {
    public final int f40854a;
    public final p00 f40855b;

    public rz(p00 p00Var, int i10) {
        this.f40854a = i10;
        this.f40855b = p00Var;
    }

    @Override
    public final void run() {
        switch (this.f40854a) {
            case 0:
                p00.V(this.f40855b);
                return;
            default:
                p00.W(this.f40855b);
                return;
        }
    }
}
