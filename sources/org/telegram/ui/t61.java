package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class t61 implements View.OnClickListener {
    public final v61 f41624a;
    public final TLRPC.TL_authorization f41625b;
    public final w61 f41626c;

    public t61(w61 w61Var, v61 v61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41626c = w61Var;
        this.f41624a = v61Var;
        this.f41625b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        v61 v61Var = this.f41624a;
        Switch r02 = v61Var.d;
        r02.c(!r02.h, true);
        this.f41625b.call_requests_disabled = !v61Var.d.h;
        w61.o(this.f41626c);
    }
}
