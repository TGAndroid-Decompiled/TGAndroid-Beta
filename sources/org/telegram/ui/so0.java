package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class so0 implements Utilities.Callback {
    public final int f43369a;
    public final tp0 f43370b;

    public so0(tp0 tp0Var, int i10) {
        this.f43369a = i10;
        this.f43370b = tp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43369a) {
            case 0:
                Integer num = (Integer) obj;
                fi.h1 h1Var = this.f43370b.I;
                if (h1Var != null) {
                    h1Var.E(num.intValue());
                    return;
                }
                return;
            default:
                tp0 tp0Var = this.f43370b;
                tp0Var.f43720r = false;
                tp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    tp0Var.y0();
                    tp0Var.finishFragment();
                    tp0Var.E0();
                    return;
                }
                return;
        }
    }
}
