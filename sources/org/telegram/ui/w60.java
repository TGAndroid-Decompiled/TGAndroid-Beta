package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w60 implements View.OnClickListener {
    public final int f41805a;
    public final f70 f41806b;

    public w60(f70 f70Var, int i10) {
        this.f41805a = i10;
        this.f41806b = f70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41805a) {
            case 0:
                f70 f70Var = this.f41806b;
                f70Var.f36315f.f24550r.clearFocus();
                f70Var.f36315f.f24550r.requestFocus();
                AndroidUtilities.showKeyboard(f70Var.f36315f.f24550r);
                return;
            case 1:
                this.f41806b.o0();
                return;
            case 2:
                f70 f70Var2 = this.f41806b;
                f70Var2.n0(f70Var2.l0());
                return;
            case 3:
                f70 f70Var3 = this.f41806b;
                f70Var3.n0(f70Var3.l0());
                return;
            default:
                f70 f70Var4 = this.f41806b;
                f70Var4.X = null;
                f70Var4.Z.b();
                f70Var4.h.b();
                f70Var4.k0();
                f70Var4.r0();
                f70Var4.s0();
                return;
        }
    }
}
