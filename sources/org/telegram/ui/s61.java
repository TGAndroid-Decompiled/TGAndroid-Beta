package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f41312a;
    public final y61 f41313b;

    public s61(y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41313b = y61Var;
        this.f41312a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y61.m(this.f41313b, this.f41312a.ip);
    }
}
