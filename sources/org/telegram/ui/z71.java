package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f43331a;
    public final g81 f43332b;

    public z71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f43332b = g81Var;
        this.f43331a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f43332b, this.f43331a.country);
        return true;
    }
}
