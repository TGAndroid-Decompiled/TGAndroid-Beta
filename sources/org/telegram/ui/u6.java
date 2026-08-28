package org.telegram.ui;

import android.content.Context;
public final class u6 extends org.telegram.ui.Components.uc {
    public final w6 f43144a0;

    public u6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.uc.S, 0, org.telegram.ui.Components.uc.T);
        this.f43144a0 = w6Var;
    }

    @Override
    public final void d(int i9, boolean z10) {
        y6 y6Var = this.f43144a0.f43679e;
        if (!z10) {
            y6Var.f44738b.j1();
            return;
        }
        int i10 = -1;
        if (i9 == 8) {
            i9 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < y6Var.W.size()) {
                t6 t6Var = (t6) y6Var.W.get(i11);
                if (t6Var != null && t6Var.f48814a == 11 && t6Var.f42865f == i9) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            y6Var.f44738b.e1(new h3.x(i10, 2), 0, true);
        } else {
            y6Var.f44738b.j1();
        }
    }
}
