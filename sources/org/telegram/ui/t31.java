package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t31 implements View.OnClickListener {
    public final TLRPC.TL_authorization f41531a;
    public final a41 f41532b;

    public t31(a41 a41Var, TLRPC.TL_authorization tL_authorization) {
        this.f41532b = a41Var;
        this.f41531a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        a41.I0(this.f41532b, this.f41531a.country);
    }
}
