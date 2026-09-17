package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39403a;
    public final f81 f39404b;

    public x71(f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39404b = f81Var;
        this.f39403a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81.m(this.f39404b, this.f39403a.country);
    }
}
