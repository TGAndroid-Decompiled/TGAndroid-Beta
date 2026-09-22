package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39774a;
    public final e81 f39775b;

    public y71(e81 e81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39775b = e81Var;
        this.f39774a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        e81.m(this.f39775b, this.f39774a.ip);
    }
}
