package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class zo0 implements Utilities.Callback {
    public final int f40575a;
    public final cq0 f40576b;

    public zo0(cq0 cq0Var, int i10) {
        this.f40575a = i10;
        this.f40576b = cq0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40575a) {
            case 0:
                cq0 cq0Var = this.f40576b;
                cq0Var.f32824r = false;
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
                ci.i1 i1Var = this.f40576b.I;
                if (i1Var != null) {
                    i1Var.E(num.intValue());
                    return;
                }
                return;
        }
    }
}
