package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s60 implements View.OnClickListener {
    public final int f37133a;
    public final b70 f37134b;

    public s60(b70 b70Var, int i10) {
        this.f37133a = i10;
        this.f37134b = b70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37133a) {
            case 0:
                b70 b70Var = this.f37134b;
                b70Var.f31991f.f22890r.clearFocus();
                b70Var.f31991f.f22890r.requestFocus();
                AndroidUtilities.showKeyboard(b70Var.f31991f.f22890r);
                return;
            case 1:
                this.f37134b.o0();
                return;
            case 2:
                b70 b70Var2 = this.f37134b;
                b70Var2.n0(b70Var2.l0());
                return;
            case 3:
                b70 b70Var3 = this.f37134b;
                b70Var3.n0(b70Var3.l0());
                return;
            default:
                b70 b70Var4 = this.f37134b;
                b70Var4.X = null;
                b70Var4.Z.b();
                b70Var4.h.b();
                b70Var4.k0();
                b70Var4.r0();
                b70Var4.s0();
                return;
        }
    }
}
