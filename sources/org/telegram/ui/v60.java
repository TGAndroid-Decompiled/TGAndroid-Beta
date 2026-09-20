package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v60 implements View.OnClickListener {
    public final int f38417a;
    public final e70 f38418b;

    public v60(e70 e70Var, int i10) {
        this.f38417a = i10;
        this.f38418b = e70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38417a) {
            case 0:
                e70 e70Var = this.f38418b;
                e70Var.f33253f.f22856r.clearFocus();
                e70Var.f33253f.f22856r.requestFocus();
                AndroidUtilities.showKeyboard(e70Var.f33253f.f22856r);
                return;
            case 1:
                this.f38418b.o0();
                return;
            case 2:
                e70 e70Var2 = this.f38418b;
                e70Var2.n0(e70Var2.l0());
                return;
            case 3:
                e70 e70Var3 = this.f38418b;
                e70Var3.n0(e70Var3.l0());
                return;
            default:
                e70 e70Var4 = this.f38418b;
                e70Var4.X = null;
                e70Var4.Z.b();
                e70Var4.h.b();
                e70Var4.k0();
                e70Var4.r0();
                e70Var4.s0();
                return;
        }
    }
}
