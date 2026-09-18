package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40151a;
    public final f81 f40152b;

    public z71(f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f40152b = f81Var;
        this.f40151a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81.m(this.f40152b, this.f40151a.ip);
    }
}
