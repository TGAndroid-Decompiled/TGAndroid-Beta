package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u31 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f41785a;
    public final a41 f41786b;

    public u31(a41 a41Var, TLRPC.TL_authorization tL_authorization) {
        this.f41786b = a41Var;
        this.f41785a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        a41.I0(this.f41786b, this.f41785a.country);
        return true;
    }
}
