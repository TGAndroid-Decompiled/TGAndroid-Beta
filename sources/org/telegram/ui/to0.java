package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class to0 implements Utilities.Callback {
    public final int f40917a;
    public final wp0 f40918b;

    public to0(wp0 wp0Var, int i10) {
        this.f40917a = i10;
        this.f40918b = wp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40917a) {
            case 0:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.f40918b.I;
                if (i1Var != null) {
                    i1Var.E(num.intValue());
                    return;
                }
                return;
            default:
                wp0 wp0Var = this.f40918b;
                wp0Var.f42581r = false;
                wp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    wp0Var.x0();
                    wp0Var.finishFragment();
                    wp0Var.D0();
                    return;
                }
                return;
        }
    }
}
