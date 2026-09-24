package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class u71 implements View.OnClickListener {
    public final w71 f38320a;
    public final TLRPC.TL_authorization f38321b;
    public final x71 f38322c;

    public u71(x71 x71Var, w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38322c = x71Var;
        this.f38320a = w71Var;
        this.f38321b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w71 w71Var = this.f38320a;
        Switch r02 = w71Var.d;
        r02.c(!r02.h, true);
        this.f38321b.call_requests_disabled = !w71Var.d.h;
        x71.n(this.f38322c);
    }
}
