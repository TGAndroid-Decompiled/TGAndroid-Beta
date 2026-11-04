package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x11 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f51692a;
    public final b21 f51693b;

    public x11(b21 b21Var, TLRPC.TL_authorization tL_authorization) {
        this.f51693b = b21Var;
        this.f51692a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        b21.I0(this.f51693b, this.f51692a.country);
        return true;
    }
}
