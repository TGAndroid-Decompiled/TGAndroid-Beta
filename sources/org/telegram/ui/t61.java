package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f43689a;
    public final z61 f43690b;

    public t61(z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.f43690b = z61Var;
        this.f43689a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z61.m(this.f43690b, this.f43689a.ip);
    }
}
