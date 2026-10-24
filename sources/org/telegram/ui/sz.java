package org.telegram.ui;
public final class sz implements Runnable {
    public final int f41828a;
    public final q00 f41829b;

    public sz(q00 q00Var, int i10) {
        this.f41828a = i10;
        this.f41829b = q00Var;
    }

    @Override
    public final void run() {
        switch (this.f41828a) {
            case 0:
                q00.V(this.f41829b);
                return;
            default:
                q00.W(this.f41829b);
                return;
        }
    }
}
