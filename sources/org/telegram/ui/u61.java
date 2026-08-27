package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

public final class u61 implements View.OnClickListener {

    public final w61 f43144a;

    public final TLRPC.TL_authorization f43145b;

    public final x61 f43146c;

    public u61(x61 x61Var, w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f43146c = x61Var;
        this.f43144a = w61Var;
        this.f43145b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w61 w61Var = this.f43144a;
        Switch r10 = w61Var.d;
        r10.c(!r10.h, true);
        this.f43145b.call_requests_disabled = !w61Var.d.h;
        x61.n(this.f43146c);
    }
}
