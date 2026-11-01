package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v31 implements View.OnClickListener {
    public final TLRPC.TL_authorization f42402a;
    public final a41 f42403b;

    public v31(a41 a41Var, TLRPC.TL_authorization tL_authorization) {
        this.f42403b = a41Var;
        this.f42402a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        a41.I0(this.f42403b, this.f42402a.ip);
    }
}
