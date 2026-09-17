package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40146a;
    public final f81 f40147b;

    public z71(f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f40147b = f81Var;
        this.f40146a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81.m(this.f40147b, this.f40146a.ip);
    }
}
