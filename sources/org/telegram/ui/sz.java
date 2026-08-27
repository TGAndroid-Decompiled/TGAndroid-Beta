package org.telegram.ui;

public final class sz implements Runnable {

    public final int f42724a;

    public final q00 f42725b;

    public sz(q00 q00Var, int i10) {
        this.f42724a = i10;
        this.f42725b = q00Var;
    }

    @Override
    public final void run() {
        switch (this.f42724a) {
            case 0:
                q00.V(this.f42725b);
                break;
            default:
                q00.W(this.f42725b);
                break;
        }
    }
}
