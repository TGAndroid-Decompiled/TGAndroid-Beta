package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class v61 implements View.OnClickListener {
    public final y61 f44721a;
    public final TLRPC.TL_authorization f44722b;
    public final z61 f44723c;

    public v61(z61 z61Var, y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f44723c = z61Var;
        this.f44721a = y61Var;
        this.f44722b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y61 y61Var = this.f44721a;
        Switch r02 = y61Var.d;
        r02.c(!r02.h, true);
        this.f44722b.encrypted_requests_disabled = !y61Var.d.h;
        z61.n(this.f44723c);
    }
}
