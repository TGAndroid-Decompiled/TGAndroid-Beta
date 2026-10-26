package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class qo0 implements Utilities.Callback {
    public final int f42882a;
    public final rp0 f42883b;

    public qo0(rp0 rp0Var, int i10) {
        this.f42882a = i10;
        this.f42883b = rp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42882a) {
            case 0:
                Integer num = (Integer) obj;
                fi.h1 h1Var = this.f42883b.I;
                if (h1Var != null) {
                    h1Var.E(num.intValue());
                    return;
                }
                return;
            default:
                rp0 rp0Var = this.f42883b;
                rp0Var.f43234r = false;
                rp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    rp0Var.y0();
                    rp0Var.finishFragment();
                    rp0Var.E0();
                    return;
                }
                return;
        }
    }
}
