package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class xo0 implements Utilities.Callback {
    public final int f44087a;
    public final aq0 f44088b;

    public xo0(aq0 aq0Var, int i10) {
        this.f44087a = i10;
        this.f44088b = aq0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44087a) {
            case 0:
                aq0 aq0Var = this.f44088b;
                aq0Var.f35996r = false;
                aq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    aq0Var.x0();
                    aq0Var.finishFragment();
                    aq0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ci.h1 h1Var = this.f44088b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
