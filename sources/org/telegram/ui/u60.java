package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u60 implements View.OnClickListener {
    public final int f41126a;
    public final d70 f41127b;

    public u60(d70 d70Var, int i10) {
        this.f41126a = i10;
        this.f41127b = d70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41126a) {
            case 0:
                d70 d70Var = this.f41127b;
                d70Var.f35686f.f26295r.clearFocus();
                d70Var.f35686f.f26295r.requestFocus();
                AndroidUtilities.showKeyboard(d70Var.f35686f.f26295r);
                return;
            case 1:
                this.f41127b.o0();
                return;
            case 2:
                d70 d70Var2 = this.f41127b;
                d70Var2.n0(d70Var2.l0());
                return;
            case 3:
                d70 d70Var3 = this.f41127b;
                d70Var3.n0(d70Var3.l0());
                return;
            default:
                d70 d70Var4 = this.f41127b;
                d70Var4.X = null;
                d70Var4.Z.b();
                d70Var4.h.b();
                d70Var4.k0();
                d70Var4.r0();
                d70Var4.s0();
                return;
        }
    }
}
