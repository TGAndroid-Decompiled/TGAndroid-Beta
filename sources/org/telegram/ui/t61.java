package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f41883a;
    public final y61 f41884b;

    public t61(y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41884b = y61Var;
        this.f41883a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        y61.m(this.f41884b, this.f41883a.country);
        return true;
    }
}
