package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39943a;
    public final z71 f39944b;

    public r71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f39944b = z71Var;
        this.f39943a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z71.m(this.f39944b, this.f39943a.country);
    }
}
