package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r60 implements View.OnClickListener {
    public final int f37718a;
    public final a70 f37719b;

    public r60(a70 a70Var, int i10) {
        this.f37718a = i10;
        this.f37719b = a70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37718a) {
            case 0:
                a70 a70Var = this.f37719b;
                a70Var.f32491f.f24117r.clearFocus();
                a70Var.f32491f.f24117r.requestFocus();
                AndroidUtilities.showKeyboard(a70Var.f32491f.f24117r);
                return;
            case 1:
                this.f37719b.o0();
                return;
            case 2:
                a70 a70Var2 = this.f37719b;
                a70Var2.n0(a70Var2.l0());
                return;
            case 3:
                a70 a70Var3 = this.f37719b;
                a70Var3.n0(a70Var3.l0());
                return;
            default:
                a70 a70Var4 = this.f37719b;
                a70Var4.U = null;
                a70Var4.W.b();
                a70Var4.h.b();
                a70Var4.k0();
                a70Var4.r0();
                a70Var4.s0();
                return;
        }
    }
}
