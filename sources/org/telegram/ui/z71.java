package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40134a;
    public final g81 f40135b;

    public z71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f40135b = g81Var;
        this.f40134a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f40135b, this.f40134a.country);
        return true;
    }
}
