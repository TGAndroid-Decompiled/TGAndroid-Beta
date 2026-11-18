package org.telegram.ui;
public final class vl0 implements Runnable {
    public final int f52801a;
    public final fm0 f52802b;

    public vl0(fm0 fm0Var, int i7) {
        this.f52801a = i7;
        this.f52802b = fm0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f52801a;
        fm0 fm0Var = this.f52802b;
        switch (i7) {
            case 0:
                if (fm0Var.H) {
                    fm0Var.f47696b.invalidate();
                    return;
                }
                return;
            case 1:
                fm0Var.h();
                return;
            case 2:
                int i10 = fm0.f47693r0;
                fm0Var.h();
                return;
            default:
                int i11 = fm0.f47693r0;
                fm0Var.h();
                return;
        }
    }
}
