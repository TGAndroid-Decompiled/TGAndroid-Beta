package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f43042a;
    public final g81 f43043b;

    public y71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f43043b = g81Var;
        this.f43042a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.m(this.f43043b, this.f43042a.country);
    }
}
