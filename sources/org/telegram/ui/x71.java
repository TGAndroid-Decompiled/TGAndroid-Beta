package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39525a;
    public final e81 f39526b;

    public x71(e81 e81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39526b = e81Var;
        this.f39525a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        e81.m(this.f39526b, this.f39525a.country);
        return true;
    }
}
