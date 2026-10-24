package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f41043a;
    public final x61 f41044b;

    public r61(x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41044b = x61Var;
        this.f41043a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x61.m(this.f41044b, this.f41043a.ip);
    }
}
