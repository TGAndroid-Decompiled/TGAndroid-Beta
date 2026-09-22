package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40156a;
    public final g81 f40157b;

    public z71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f40157b = g81Var;
        this.f40156a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f40157b, this.f40156a.country);
        return true;
    }
}
