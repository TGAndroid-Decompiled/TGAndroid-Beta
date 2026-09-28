package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class u71 implements View.OnClickListener {
    public final w71 f38339a;
    public final TLRPC.TL_authorization f38340b;
    public final x71 f38341c;

    public u71(x71 x71Var, w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38341c = x71Var;
        this.f38339a = w71Var;
        this.f38340b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w71 w71Var = this.f38339a;
        Switch r02 = w71Var.d;
        r02.c(!r02.h, true);
        this.f38340b.call_requests_disabled = !w71Var.d.h;
        x71.n(this.f38341c);
    }
}
