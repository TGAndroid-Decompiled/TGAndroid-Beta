package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class t71 implements View.OnClickListener {
    public final v71 f37551a;
    public final TLRPC.TL_authorization f37552b;
    public final w71 f37553c;

    public t71(w71 w71Var, v71 v71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37553c = w71Var;
        this.f37551a = v71Var;
        this.f37552b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        v71 v71Var = this.f37551a;
        Switch r02 = v71Var.d;
        r02.c(!r02.h, true);
        this.f37552b.call_requests_disabled = !v71Var.d.h;
        w71.n(this.f37553c);
    }
}
