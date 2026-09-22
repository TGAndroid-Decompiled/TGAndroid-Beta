package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40086a;
    public final e81 f40087b;

    public z71(e81 e81Var, TLRPC.TL_authorization tL_authorization) {
        this.f40087b = e81Var;
        this.f40086a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        e81.m(this.f40087b, this.f40086a.country);
        return true;
    }
}
