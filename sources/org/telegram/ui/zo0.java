package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class zo0 implements Utilities.Callback {
    public final int f44890a;
    public final cq0 f44891b;

    public zo0(cq0 cq0Var, int i10) {
        this.f44890a = i10;
        this.f44891b = cq0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44890a) {
            case 0:
                cq0 cq0Var = this.f44891b;
                cq0Var.f36491r = false;
                cq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    cq0Var.x0();
                    cq0Var.finishFragment();
                    cq0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ci.h1 h1Var = this.f44891b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
