package org.telegram.ui;

import android.content.Context;
public final class t6 extends org.telegram.ui.Components.zc {
    public final v6 f42556a0;

    public t6(v6 v6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.zc.S, 0, org.telegram.ui.Components.zc.T);
        this.f42556a0 = v6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        x6 x6Var = this.f42556a0.f43438e;
        if (!z10) {
            x6Var.f44485b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < x6Var.W.size()) {
                s6 s6Var = (s6) x6Var.W.get(i12);
                if (s6Var != null && s6Var.f50845a == 11 && s6Var.f42284f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            x6Var.f44485b.e1(new j3.x(i11, 2), 0, true);
        } else {
            x6Var.f44485b.j1();
        }
    }
}
