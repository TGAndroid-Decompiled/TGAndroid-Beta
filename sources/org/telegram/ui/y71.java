package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39842a;
    public final g81 f39843b;

    public y71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39843b = g81Var;
        this.f39842a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.m(this.f39843b, this.f39842a.country);
    }
}
