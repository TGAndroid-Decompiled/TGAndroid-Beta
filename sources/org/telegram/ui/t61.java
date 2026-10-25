package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f43686a;
    public final z61 f43687b;

    public t61(z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.f43687b = z61Var;
        this.f43686a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z61.m(this.f43687b, this.f43686a.ip);
    }
}
