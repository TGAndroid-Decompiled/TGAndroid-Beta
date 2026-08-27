package org.telegram.ui;

import android.content.Context;

public final class v6 extends org.telegram.ui.Components.sc {

    public final x6 f43369a0;

    public v6(x6 x6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.sc.S, 0, org.telegram.ui.Components.sc.T);
        this.f43369a0 = x6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        z6 z6Var = this.f43369a0.f44289e;
        if (!z10) {
            z6Var.f45039b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        for (int i12 = 0; i12 < z6Var.W.size(); i12++) {
            u6 u6Var = (u6) z6Var.W.get(i12);
            if (u6Var != null && u6Var.f49413a == 11 && u6Var.f43129f == i10) {
                i11 = i12;
                break;
            }
        }
        if (i11 >= 0) {
            z6Var.f45039b.e1(new h3.y(i11, 2), 0, true);
        } else {
            z6Var.f45039b.j1();
        }
    }
}
