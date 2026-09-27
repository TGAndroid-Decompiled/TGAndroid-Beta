package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class to0 implements Utilities.Callback {
    public final int f37879a;
    public final wp0 f37880b;

    public to0(wp0 wp0Var, int i10) {
        this.f37879a = i10;
        this.f37880b = wp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37879a) {
            case 0:
                wp0 wp0Var = this.f37880b;
                wp0Var.f39404r = false;
                wp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    wp0Var.x0();
                    wp0Var.finishFragment();
                    wp0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.f37880b.I;
                if (i1Var != null) {
                    i1Var.E(num.intValue());
                    return;
                }
                return;
        }
    }
}
