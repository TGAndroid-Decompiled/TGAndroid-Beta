package org.telegram.ui;
public final class r81 implements Runnable {
    public final int f51523a;
    public final w81 f51524b;

    public r81(w81 w81Var, int i7) {
        this.f51523a = i7;
        this.f51524b = w81Var;
    }

    @Override
    public final void run() {
        switch (this.f51523a) {
            case 0:
                w81 w81Var = this.f51524b;
                w81Var.getClass();
                new ug.z0((org.telegram.ui.ActionBar.h2) w81Var, 11, false).show();
                return;
            default:
                w81 w81Var2 = this.f51524b;
                w81Var2.f52976e.requestFocus();
                org.telegram.messenger.g0.I3(w81Var2.f52976e);
                return;
        }
    }
}
