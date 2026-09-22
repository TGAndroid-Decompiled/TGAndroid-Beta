package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class yo0 implements Utilities.Callback {
    public final int f39920a;
    public final aq0 f39921b;

    public yo0(aq0 aq0Var, int i10) {
        this.f39920a = i10;
        this.f39921b = aq0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39920a) {
            case 0:
                aq0 aq0Var = this.f39921b;
                aq0Var.f31886r = false;
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
                ci.i1 i1Var = this.f39921b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
