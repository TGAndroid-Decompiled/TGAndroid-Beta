package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40713a;
    public final z71 f40714b;

    public t71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f40714b = z71Var;
        this.f40713a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z71.m(this.f40714b, this.f40713a.ip);
    }
}
