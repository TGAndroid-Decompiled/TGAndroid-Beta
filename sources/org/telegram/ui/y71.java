package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39822a;
    public final g81 f39823b;

    public y71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39823b = g81Var;
        this.f39822a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.m(this.f39823b, this.f39822a.country);
    }
}
