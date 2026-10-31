package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y31 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f43691a;
    public final c41 f43692b;

    public y31(c41 c41Var, TLRPC.TL_authorization tL_authorization) {
        this.f43692b = c41Var;
        this.f43691a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        c41.I0(this.f43692b, this.f43691a.country);
        return true;
    }
}
