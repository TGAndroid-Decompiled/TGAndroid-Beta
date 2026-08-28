package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class v61 implements View.OnClickListener {
    public final x61 f43396a;
    public final TLRPC.TL_authorization f43397b;
    public final y61 f43398c;

    public v61(y61 y61Var, x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f43398c = y61Var;
        this.f43396a = x61Var;
        this.f43397b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x61 x61Var = this.f43396a;
        Switch r02 = x61Var.d;
        r02.c(!r02.h, true);
        this.f43397b.call_requests_disabled = !x61Var.d.h;
        y61.n(this.f43398c);
    }
}
