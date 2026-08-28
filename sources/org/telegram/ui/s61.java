package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f42569a;
    public final y61 f42570b;

    public s61(y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f42570b = y61Var;
        this.f42569a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y61.m(this.f42570b, this.f42569a.ip);
    }
}
