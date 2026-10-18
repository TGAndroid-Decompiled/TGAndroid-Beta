package org.telegram.ui;
public final class rz implements Runnable {
    public final int f40816a;
    public final p00 f40817b;

    public rz(p00 p00Var, int i10) {
        this.f40816a = i10;
        this.f40817b = p00Var;
    }

    @Override
    public final void run() {
        switch (this.f40816a) {
            case 0:
                p00.V(this.f40817b);
                return;
            default:
                p00.W(this.f40817b);
                return;
        }
    }
}
