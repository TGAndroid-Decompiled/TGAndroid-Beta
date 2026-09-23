package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class so0 implements Utilities.Callback {
    public final int f37378a;
    public final up0 f37379b;

    public so0(up0 up0Var, int i10) {
        this.f37378a = i10;
        this.f37379b = up0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37378a) {
            case 0:
                up0 up0Var = this.f37379b;
                up0Var.f38159r = false;
                up0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    up0Var.x0();
                    up0Var.finishFragment();
                    up0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.f37379b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
