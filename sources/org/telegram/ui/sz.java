package org.telegram.ui;
public final class sz implements Runnable {
    public final int f43433a;
    public final q00 f43434b;

    public sz(q00 q00Var, int i10) {
        this.f43433a = i10;
        this.f43434b = q00Var;
    }

    @Override
    public final void run() {
        switch (this.f43433a) {
            case 0:
                q00.W(this.f43434b);
                return;
            default:
                q00.X(this.f43434b);
                return;
        }
    }
}
