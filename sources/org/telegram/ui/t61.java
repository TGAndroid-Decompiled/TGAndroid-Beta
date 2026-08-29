package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f42568a;
    public final a71 f42569b;

    public t61(a71 a71Var, TLRPC.TL_authorization tL_authorization) {
        this.f42569b = a71Var;
        this.f42568a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        a71.m(this.f42569b, this.f42568a.country);
        return true;
    }
}
