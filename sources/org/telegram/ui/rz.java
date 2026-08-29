package org.telegram.ui;
public final class rz implements Runnable {
    public final int f42236a;
    public final p00 f42237b;

    public rz(p00 p00Var, int i10) {
        this.f42236a = i10;
        this.f42237b = p00Var;
    }

    @Override
    public final void run() {
        switch (this.f42236a) {
            case 0:
                p00.V(this.f42237b);
                return;
            default:
                p00.W(this.f42237b);
                return;
        }
    }
}
