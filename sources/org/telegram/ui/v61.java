package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f43448a;
    public final a71 f43449b;

    public v61(a71 a71Var, TLRPC.TL_authorization tL_authorization) {
        this.f43449b = a71Var;
        this.f43448a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        a71.m(this.f43449b, this.f43448a.country);
        return true;
    }
}
