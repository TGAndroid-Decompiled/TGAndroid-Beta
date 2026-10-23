package org.telegram.ui;
public final class xf0 implements Runnable {
    public final int f43591a;
    public final hg0 f43592b;

    public xf0(hg0 hg0Var, int i10) {
        this.f43591a = i10;
        this.f43592b = hg0Var;
    }

    @Override
    public final void run() {
        switch (this.f43591a) {
            case 0:
                hg0 hg0Var = this.f43592b;
                pj0 pj0Var = hg0Var.f37845a;
                ig0 ig0Var = hg0Var.f37846a0;
                eg0 eg0Var = hg0Var.f37847b;
                if (eg0Var != null) {
                    if (ig0Var.f38197c0) {
                        pj0Var.clearFocus();
                        eg0Var.clearFocus();
                    } else if (pj0Var.length() != 0) {
                        eg0Var.requestFocus();
                        if (!hg0Var.T) {
                            eg0Var.setSelection(eg0Var.length());
                        }
                        ig0.V0(ig0Var, eg0Var);
                    } else {
                        pj0Var.requestFocus();
                        ig0.V0(ig0Var, pj0Var);
                    }
                }
                if (ig0Var.F == 0) {
                    hg0Var.r(false);
                    return;
                }
                return;
            case 1:
                hg0 hg0Var2 = this.f43592b;
                hg0Var2.postDelayed(new xf0(hg0Var2, 2), 200L);
                return;
            case 2:
                this.f43592b.h(null);
                return;
            case 3:
                this.f43592b.r(true);
                return;
            default:
                hg0 hg0Var3 = this.f43592b;
                ig0.V0(hg0Var3.f37846a0, hg0Var3.f37847b);
                return;
        }
    }
}
