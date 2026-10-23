package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class v61 implements View.OnClickListener {
    public final x61 f42619a;
    public final TLRPC.TL_authorization f42620b;
    public final y61 f42621c;

    public v61(y61 y61Var, x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f42621c = y61Var;
        this.f42619a = x61Var;
        this.f42620b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x61 x61Var = this.f42619a;
        Switch r02 = x61Var.d;
        r02.c(!r02.h, true);
        this.f42620b.call_requests_disabled = !x61Var.d.h;
        y61.n(this.f42621c);
    }
}
