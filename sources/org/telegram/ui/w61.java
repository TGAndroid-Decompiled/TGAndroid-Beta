package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f44529a;
    public final c71 f44530b;

    public w61(c71 c71Var, TLRPC.TL_authorization tL_authorization) {
        this.f44530b = c71Var;
        this.f44529a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        c71.m(this.f44530b, this.f44529a.ip);
    }
}
