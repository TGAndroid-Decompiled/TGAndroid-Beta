package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40004a;
    public final x71 f40005b;

    public r71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f40005b = x71Var;
        this.f40004a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x71.m(this.f40005b, this.f40004a.ip);
    }
}
