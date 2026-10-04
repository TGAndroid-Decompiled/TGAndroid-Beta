package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39944a;
    public final z71 f39945b;

    public r71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f39945b = z71Var;
        this.f39944a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z71.m(this.f39945b, this.f39944a.country);
    }
}
