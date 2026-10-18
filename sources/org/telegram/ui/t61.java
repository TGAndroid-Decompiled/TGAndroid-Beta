package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class t61 implements View.OnClickListener {
    public final v61 f41589a;
    public final TLRPC.TL_authorization f41590b;
    public final w61 f41591c;

    public t61(w61 w61Var, v61 v61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41591c = w61Var;
        this.f41589a = v61Var;
        this.f41590b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        v61 v61Var = this.f41589a;
        Switch r02 = v61Var.d;
        r02.c(!r02.h, true);
        this.f41590b.call_requests_disabled = !v61Var.d.h;
        w61.o(this.f41591c);
    }
}
