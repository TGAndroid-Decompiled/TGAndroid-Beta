package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class t61 implements View.OnClickListener {
    public final w61 f41891a;
    public final TLRPC.TL_authorization f41892b;
    public final x61 f41893c;

    public t61(x61 x61Var, w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41893c = x61Var;
        this.f41891a = w61Var;
        this.f41892b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w61 w61Var = this.f41891a;
        Switch r02 = w61Var.d;
        r02.c(!r02.h, true);
        this.f41892b.encrypted_requests_disabled = !w61Var.d.h;
        x61.n(this.f41893c);
    }
}
