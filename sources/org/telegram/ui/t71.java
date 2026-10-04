package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40712a;
    public final z71 f40713b;

    public t71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f40713b = z71Var;
        this.f40712a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z71.m(this.f40713b, this.f40712a.ip);
    }
}
