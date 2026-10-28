package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f43894a;
    public final c71 f43895b;

    public u61(c71 c71Var, TLRPC.TL_authorization tL_authorization) {
        this.f43895b = c71Var;
        this.f43894a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        c71.m(this.f43895b, this.f43894a.country);
    }
}
