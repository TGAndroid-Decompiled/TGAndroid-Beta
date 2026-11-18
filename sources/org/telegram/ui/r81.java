package org.telegram.ui;
public final class r81 implements Runnable {
    public final int f51533a;
    public final w81 f51534b;

    public r81(w81 w81Var, int i7) {
        this.f51533a = i7;
        this.f51534b = w81Var;
    }

    @Override
    public final void run() {
        switch (this.f51533a) {
            case 0:
                w81 w81Var = this.f51534b;
                w81Var.getClass();
                new ug.z0((org.telegram.ui.ActionBar.h2) w81Var, 11, false).show();
                return;
            default:
                w81 w81Var2 = this.f51534b;
                w81Var2.f53012e.requestFocus();
                org.telegram.messenger.g0.I3(w81Var2.f53012e);
                return;
        }
    }
}
