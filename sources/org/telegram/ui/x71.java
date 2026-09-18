package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39375a;
    public final d81 f39376b;

    public x71(d81 d81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39376b = d81Var;
        this.f39375a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        d81.m(this.f39376b, this.f39375a.ip);
    }
}
