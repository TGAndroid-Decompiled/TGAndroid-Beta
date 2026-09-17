package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f43332a;
    public final g81 f43333b;

    public z71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f43333b = g81Var;
        this.f43332a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f43333b, this.f43332a.country);
        return true;
    }
}
