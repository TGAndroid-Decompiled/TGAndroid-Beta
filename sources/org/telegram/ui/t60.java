package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t60 implements View.OnClickListener {
    public final int f41868a;
    public final c70 f41869b;

    public t60(c70 c70Var, int i10) {
        this.f41868a = i10;
        this.f41869b = c70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41868a) {
            case 0:
                c70 c70Var = this.f41869b;
                c70Var.f36551f.f30614r.clearFocus();
                c70Var.f36551f.f30614r.requestFocus();
                AndroidUtilities.showKeyboard(c70Var.f36551f.f30614r);
                return;
            case 1:
                this.f41869b.o0();
                return;
            case 2:
                c70 c70Var2 = this.f41869b;
                c70Var2.n0(c70Var2.l0());
                return;
            case 3:
                c70 c70Var3 = this.f41869b;
                c70Var3.n0(c70Var3.l0());
                return;
            default:
                c70 c70Var4 = this.f41869b;
                c70Var4.X = null;
                c70Var4.Z.b();
                c70Var4.h.b();
                c70Var4.k0();
                c70Var4.r0();
                c70Var4.s0();
                return;
        }
    }
}
