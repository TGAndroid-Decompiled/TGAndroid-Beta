package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class s61 implements View.OnLongClickListener {

    public final TLRPC.TL_authorization f42528a;

    public final x61 f42529b;

    public s61(x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f42529b = x61Var;
        this.f42528a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x61.m(this.f42529b, this.f42528a.country);
        return true;
    }
}
