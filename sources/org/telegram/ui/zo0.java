package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class zo0 implements Utilities.Callback {
    public final int f43503a;
    public final bq0 f43504b;

    public zo0(bq0 bq0Var, int i10) {
        this.f43503a = i10;
        this.f43504b = bq0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43503a) {
            case 0:
                bq0 bq0Var = this.f43504b;
                bq0Var.f34902r = false;
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
                di.i1 i1Var = this.f43504b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
