package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40612a;
    public final w61 f40613b;

    public r61(w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40613b = w61Var;
        this.f40612a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        w61.n(this.f40613b, this.f40612a.country);
        return true;
    }
}
