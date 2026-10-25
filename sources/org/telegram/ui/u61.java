package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f44027a;
    public final z61 f44028b;

    public u61(z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.f44028b = z61Var;
        this.f44027a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        z61.m(this.f44028b, this.f44027a.country);
        return true;
    }
}
