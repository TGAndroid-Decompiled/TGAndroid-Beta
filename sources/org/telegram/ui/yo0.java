package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class yo0 implements Utilities.Callback {
    public final int f39074a;
    public final bq0 f39075b;

    public yo0(bq0 bq0Var, int i10) {
        this.f39074a = i10;
        this.f39075b = bq0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39074a) {
            case 0:
                bq0 bq0Var = this.f39075b;
                bq0Var.f31353r = false;
                bq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    bq0Var.x0();
                    bq0Var.finishFragment();
                    bq0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                bi.p1 p1Var = this.f39075b.I;
                if (p1Var != null) {
                    p1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
