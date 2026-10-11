package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class wo0 implements Utilities.Callback {
    public final int f43874a;
    public final zp0 f43875b;

    public wo0(zp0 zp0Var, int i10) {
        this.f43874a = i10;
        this.f43875b = zp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43874a) {
            case 0:
                zp0 zp0Var = this.f43875b;
                zp0Var.f45087r = false;
                zp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    zp0Var.x0();
                    zp0Var.finishFragment();
                    zp0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ci.h1 h1Var = this.f43875b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
