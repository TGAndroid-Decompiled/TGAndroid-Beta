package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f42878a;
    public final y61 f42879b;

    public t61(y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f42879b = y61Var;
        this.f42878a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        y61.m(this.f42879b, this.f42878a.country);
        return true;
    }
}
