package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f43016a;
    public final g81 f43017b;

    public y71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f43017b = g81Var;
        this.f43016a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.m(this.f43017b, this.f43016a.country);
    }
}
