package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u60 implements View.OnClickListener {
    public final int f41075a;
    public final d70 f41076b;

    public u60(d70 d70Var, int i10) {
        this.f41075a = i10;
        this.f41076b = d70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41075a) {
            case 0:
                d70 d70Var = this.f41076b;
                d70Var.f35674f.f26252r.clearFocus();
                d70Var.f35674f.f26252r.requestFocus();
                AndroidUtilities.showKeyboard(d70Var.f35674f.f26252r);
                return;
            case 1:
                this.f41076b.o0();
                return;
            case 2:
                d70 d70Var2 = this.f41076b;
                d70Var2.n0(d70Var2.l0());
                return;
            case 3:
                d70 d70Var3 = this.f41076b;
                d70Var3.n0(d70Var3.l0());
                return;
            default:
                d70 d70Var4 = this.f41076b;
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
