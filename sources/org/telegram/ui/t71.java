package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class t71 implements View.OnClickListener {
    public final w71 f37984a;
    public final TLRPC.TL_authorization f37985b;
    public final x71 f37986c;

    public t71(x71 x71Var, w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37986c = x71Var;
        this.f37984a = w71Var;
        this.f37985b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w71 w71Var = this.f37984a;
        Switch r02 = w71Var.d;
        r02.c(!r02.h, true);
        this.f37985b.encrypted_requests_disabled = !w71Var.d.h;
        x71.n(this.f37986c);
    }
}
