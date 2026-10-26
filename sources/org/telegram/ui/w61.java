package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class w61 implements View.OnClickListener {
    public final y61 f44989a;
    public final TLRPC.TL_authorization f44990b;
    public final z61 f44991c;

    public w61(z61 z61Var, y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f44991c = z61Var;
        this.f44989a = y61Var;
        this.f44990b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y61 y61Var = this.f44989a;
        Switch r02 = y61Var.d;
        r02.c(!r02.h, true);
        this.f44990b.call_requests_disabled = !y61Var.d.h;
        z61.n(this.f44991c);
    }
}
