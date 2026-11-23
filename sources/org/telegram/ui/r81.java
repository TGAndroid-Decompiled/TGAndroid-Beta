package org.telegram.ui;
public final class r81 implements Runnable {
    public final int f51547a;
    public final w81 f51548b;

    public r81(w81 w81Var, int i7) {
        this.f51547a = i7;
        this.f51548b = w81Var;
    }

    @Override
    public final void run() {
        switch (this.f51547a) {
            case 0:
                w81 w81Var = this.f51548b;
                w81Var.getClass();
                new ug.y0((org.telegram.ui.ActionBar.g2) w81Var, 11, false).show();
                return;
            default:
                w81 w81Var2 = this.f51548b;
                w81Var2.f52989e.requestFocus();
                org.telegram.messenger.g0.I3(w81Var2.f52989e);
                return;
        }
    }
}
