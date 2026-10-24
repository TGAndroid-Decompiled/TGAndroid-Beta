package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f41307a;
    public final x61 f41308b;

    public s61(x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41308b = x61Var;
        this.f41307a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x61.m(this.f41308b, this.f41307a.country);
        return true;
    }
}
