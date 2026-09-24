package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class t71 implements View.OnClickListener {
    public final w71 f37967a;
    public final TLRPC.TL_authorization f37968b;
    public final x71 f37969c;

    public t71(x71 x71Var, w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37969c = x71Var;
        this.f37967a = w71Var;
        this.f37968b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w71 w71Var = this.f37967a;
        Switch r02 = w71Var.d;
        r02.c(!r02.h, true);
        this.f37968b.encrypted_requests_disabled = !w71Var.d.h;
        x71.n(this.f37969c);
    }
}
