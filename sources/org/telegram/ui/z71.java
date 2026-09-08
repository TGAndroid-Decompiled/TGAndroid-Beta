package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f43358a;
    public final g81 f43359b;

    public z71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f43359b = g81Var;
        this.f43358a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f43359b, this.f43358a.country);
        return true;
    }
}
