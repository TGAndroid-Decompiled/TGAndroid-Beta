package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f42288a;
    public final y61 f42289b;

    public r61(y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f42289b = y61Var;
        this.f42288a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        y61.m(this.f42289b, this.f42288a.country);
        return true;
    }
}
