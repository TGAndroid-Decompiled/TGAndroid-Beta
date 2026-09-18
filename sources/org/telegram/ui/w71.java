package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f38713a;
    public final d81 f38714b;

    public w71(d81 d81Var, TLRPC.TL_authorization tL_authorization) {
        this.f38714b = d81Var;
        this.f38713a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        d81.m(this.f38714b, this.f38713a.country);
        return true;
    }
}
