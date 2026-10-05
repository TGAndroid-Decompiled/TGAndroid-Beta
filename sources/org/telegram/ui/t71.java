package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class t71 implements View.OnClickListener {
    public final w71 f40738a;
    public final TLRPC.TL_authorization f40739b;
    public final x71 f40740c;

    public t71(x71 x71Var, w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f40740c = x71Var;
        this.f40738a = w71Var;
        this.f40739b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w71 w71Var = this.f40738a;
        Switch r02 = w71Var.d;
        r02.c(!r02.h, true);
        this.f40739b.encrypted_requests_disabled = !w71Var.d.h;
        x71.n(this.f40740c);
    }
}
