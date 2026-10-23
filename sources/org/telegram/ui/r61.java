package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f41033a;
    public final y61 f41034b;

    public r61(y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41034b = y61Var;
        this.f41033a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        y61.m(this.f41034b, this.f41033a.country);
        return true;
    }
}
