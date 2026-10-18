package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40578a;
    public final w61 f40579b;

    public r61(w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40579b = w61Var;
        this.f40578a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        w61.n(this.f40579b, this.f40578a.country);
        return true;
    }
}
