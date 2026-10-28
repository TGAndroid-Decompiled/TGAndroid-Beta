package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f45606a;
    public final c71 f45607b;

    public x61(c71 c71Var, TLRPC.TL_authorization tL_authorization) {
        this.f45607b = c71Var;
        this.f45606a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        c71.m(this.f45607b, this.f45606a.country);
        return true;
    }
}
