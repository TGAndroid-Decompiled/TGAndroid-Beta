package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class z61 implements View.OnClickListener {
    public final b71 f46182a;
    public final TLRPC.TL_authorization f46183b;
    public final c71 f46184c;

    public z61(c71 c71Var, b71 b71Var, TLRPC.TL_authorization tL_authorization) {
        this.f46184c = c71Var;
        this.f46182a = b71Var;
        this.f46183b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        b71 b71Var = this.f46182a;
        Switch r02 = b71Var.d;
        r02.c(!r02.h, true);
        this.f46183b.call_requests_disabled = !b71Var.d.h;
        c71.n(this.f46184c);
    }
}
