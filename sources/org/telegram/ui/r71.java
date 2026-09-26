package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f37201a;
    public final x71 f37202b;

    public r71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37202b = x71Var;
        this.f37201a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x71.m(this.f37202b, this.f37201a.ip);
    }
}
