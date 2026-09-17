package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39806a;
    public final f81 f39807b;

    public y71(f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f39807b = f81Var;
        this.f39806a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        f81.m(this.f39807b, this.f39806a.country);
        return true;
    }
}
