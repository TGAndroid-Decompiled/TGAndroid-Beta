package org.telegram.ui;
public final class sz implements Runnable {
    public final int f41825a;
    public final q00 f41826b;

    public sz(q00 q00Var, int i10) {
        this.f41825a = i10;
        this.f41826b = q00Var;
    }

    @Override
    public final void run() {
        switch (this.f41825a) {
            case 0:
                q00.V(this.f41826b);
                return;
            default:
                q00.W(this.f41826b);
                return;
        }
    }
}
