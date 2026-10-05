package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40371a;
    public final x71 f40372b;

    public s71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f40372b = x71Var;
        this.f40371a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x71.m(this.f40372b, this.f40371a.country);
        return true;
    }
}
