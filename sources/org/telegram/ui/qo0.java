package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class qo0 implements Utilities.Callback {
    public final int f36955a;
    public final tp0 f36956b;

    public qo0(tp0 tp0Var, int i10) {
        this.f36955a = i10;
        this.f36956b = tp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36955a) {
            case 0:
                tp0 tp0Var = this.f36956b;
                tp0Var.f38180r = false;
                tp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    tp0Var.x0();
                    tp0Var.finishFragment();
                    tp0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.f36956b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
