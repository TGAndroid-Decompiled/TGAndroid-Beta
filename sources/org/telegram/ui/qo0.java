package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class qo0 implements Utilities.Callback {
    public final int f36940a;
    public final tp0 f36941b;

    public qo0(tp0 tp0Var, int i10) {
        this.f36940a = i10;
        this.f36941b = tp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36940a) {
            case 0:
                tp0 tp0Var = this.f36941b;
                tp0Var.f38163r = false;
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
                ci.i1 i1Var = this.f36941b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
