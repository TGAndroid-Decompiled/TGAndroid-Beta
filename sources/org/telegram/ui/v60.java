package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v60 implements View.OnClickListener {
    public final int f37420a;
    public final e70 f37421b;

    public v60(e70 e70Var, int i10) {
        this.f37420a = i10;
        this.f37421b = e70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37420a) {
            case 0:
                e70 e70Var = this.f37421b;
                e70Var.f32085f.f24572r.clearFocus();
                e70Var.f32085f.f24572r.requestFocus();
                AndroidUtilities.showKeyboard(e70Var.f32085f.f24572r);
                return;
            case 1:
                this.f37421b.o0();
                return;
            case 2:
                e70 e70Var2 = this.f37421b;
                e70Var2.n0(e70Var2.l0());
                return;
            case 3:
                e70 e70Var3 = this.f37421b;
                e70Var3.n0(e70Var3.l0());
                return;
            default:
                e70 e70Var4 = this.f37421b;
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
