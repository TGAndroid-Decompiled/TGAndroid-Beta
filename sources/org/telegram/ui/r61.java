package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f43042a;
    public final z61 f43043b;

    public r61(z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.f43043b = z61Var;
        this.f43042a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z61.m(this.f43043b, this.f43042a.country);
    }
}
