package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w31 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f42868a;
    public final c41 f42869b;

    public w31(c41 c41Var, TLRPC.TL_authorization tL_authorization) {
        this.f42869b = c41Var;
        this.f42868a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        c41.I0(this.f42869b, this.f42868a.country);
        return true;
    }
}
