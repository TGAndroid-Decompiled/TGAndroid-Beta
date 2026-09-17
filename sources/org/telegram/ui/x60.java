package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x60 implements View.OnClickListener {
    public final int f39388a;
    public final g70 f39389b;

    public x60(g70 g70Var, int i10) {
        this.f39388a = i10;
        this.f39389b = g70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39388a) {
            case 0:
                g70 g70Var = this.f39389b;
                g70Var.f33875f.f22543r.clearFocus();
                g70Var.f33875f.f22543r.requestFocus();
                AndroidUtilities.showKeyboard(g70Var.f33875f.f22543r);
                return;
            case 1:
                this.f39389b.o0();
                return;
            case 2:
                g70 g70Var2 = this.f39389b;
                g70Var2.n0(g70Var2.l0());
                return;
            case 3:
                g70 g70Var3 = this.f39389b;
                g70Var3.n0(g70Var3.l0());
                return;
            default:
                g70 g70Var4 = this.f39389b;
                g70Var4.X = null;
                g70Var4.Z.b();
                g70Var4.h.b();
                g70Var4.k0();
                g70Var4.r0();
                g70Var4.s0();
                return;
        }
    }
}
