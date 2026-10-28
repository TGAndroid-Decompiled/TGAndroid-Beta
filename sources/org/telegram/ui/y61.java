package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class y61 implements View.OnClickListener {
    public final b71 f45861a;
    public final TLRPC.TL_authorization f45862b;
    public final c71 f45863c;

    public y61(c71 c71Var, b71 b71Var, TLRPC.TL_authorization tL_authorization) {
        this.f45863c = c71Var;
        this.f45861a = b71Var;
        this.f45862b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        b71 b71Var = this.f45861a;
        Switch r02 = b71Var.d;
        r02.c(!r02.h, true);
        this.f45862b.encrypted_requests_disabled = !b71Var.d.h;
        c71.n(this.f45863c);
    }
}
