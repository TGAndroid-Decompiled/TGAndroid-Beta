package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39721a;
    public final d81 f39722b;

    public y71(d81 d81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39722b = d81Var;
        this.f39721a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        d81.m(this.f39722b, this.f39721a.country);
        return true;
    }
}
