package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

public final class t61 implements View.OnClickListener {

    public final w61 f42789a;

    public final TLRPC.TL_authorization f42790b;

    public final x61 f42791c;

    public t61(x61 x61Var, w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f42791c = x61Var;
        this.f42789a = w61Var;
        this.f42790b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w61 w61Var = this.f42789a;
        Switch r10 = w61Var.d;
        r10.c(!r10.h, true);
        this.f42790b.encrypted_requests_disabled = !w61Var.d.h;
        x61.n(this.f42791c);
    }
}
