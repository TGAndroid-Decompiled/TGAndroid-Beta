package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class u61 implements View.OnClickListener {
    public final w61 f42332a;
    public final TLRPC.TL_authorization f42333b;
    public final x61 f42334c;

    public u61(x61 x61Var, w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f42334c = x61Var;
        this.f42332a = w61Var;
        this.f42333b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w61 w61Var = this.f42332a;
        Switch r02 = w61Var.d;
        r02.c(!r02.h, true);
        this.f42333b.call_requests_disabled = !w61Var.d.h;
        x61.n(this.f42334c);
    }
}
