package org.telegram.ui;

import android.content.Context;
public final class w6 extends org.telegram.ui.Components.lc {
    public final x6 f50720f0;

    public w6(x6 x6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.lc.f35687a0, 0, org.telegram.ui.Components.lc.f35688b0);
        this.f50720f0 = x6Var;
    }

    @Override
    public final void d(int i3, boolean z10) {
        z6 z6Var = (z6) this.f50720f0.f51837f;
        if (!z10) {
            z6Var.f52547b.l1();
            return;
        }
        int i10 = -1;
        if (i3 == 8) {
            i3 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < z6Var.f52556g0.size()) {
                v6 v6Var = (v6) z6Var.f52556g0.get(i11);
                if (v6Var != null && v6Var.f54715a == 11 && v6Var.f50401f == i3) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            z6Var.f52547b.e1(new k2.v(i10, 7), 0, true);
        } else {
            z6Var.f52547b.l1();
        }
    }
}
