package org.telegram.ui;
public final class tf0 implements Runnable {
    public final int f41723a;
    public final dg0 f41724b;

    public tf0(dg0 dg0Var, int i10) {
        this.f41723a = i10;
        this.f41724b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f41723a) {
            case 0:
                dg0 dg0Var = this.f41724b;
                lj0 lj0Var = dg0Var.f36187a;
                eg0 eg0Var = dg0Var.V;
                ag0 ag0Var = dg0Var.f36188b;
                if (ag0Var != null) {
                    if (eg0Var.f36494c0) {
                        lj0Var.clearFocus();
                        ag0Var.clearFocus();
                    } else if (lj0Var.length() != 0) {
                        ag0Var.requestFocus();
                        if (!dg0Var.R) {
                            ag0Var.setSelection(ag0Var.length());
                        }
                        eg0.T0(eg0Var, ag0Var);
                    } else {
                        lj0Var.requestFocus();
                        eg0.T0(eg0Var, lj0Var);
                    }
                }
                if (eg0Var.F == 0) {
                    dg0Var.s(false);
                    return;
                }
                return;
            case 1:
                dg0 dg0Var2 = this.f41724b;
                dg0Var2.postDelayed(new tf0(dg0Var2, 2), 200L);
                return;
            case 2:
                this.f41724b.h(null);
                return;
            case 3:
                this.f41724b.s(true);
                return;
            default:
                dg0 dg0Var3 = this.f41724b;
                eg0.T0(dg0Var3.V, dg0Var3.f36188b);
                return;
        }
    }
}
