package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class u71 implements View.OnClickListener {
    public final w71 f41135a;
    public final TLRPC.TL_authorization f41136b;
    public final x71 f41137c;

    public u71(x71 x71Var, w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f41137c = x71Var;
        this.f41135a = w71Var;
        this.f41136b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w71 w71Var = this.f41135a;
        Switch r02 = w71Var.d;
        r02.c(!r02.h, true);
        this.f41136b.call_requests_disabled = !w71Var.d.h;
        x71.n(this.f41137c);
    }
}
