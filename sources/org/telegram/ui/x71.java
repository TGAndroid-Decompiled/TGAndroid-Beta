package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39514a;
    public final d81 f39515b;

    public x71(d81 d81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39515b = d81Var;
        this.f39514a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        d81.m(this.f39515b, this.f39514a.ip);
    }
}
