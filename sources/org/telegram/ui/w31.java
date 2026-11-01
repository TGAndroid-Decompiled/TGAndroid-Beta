package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w31 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f42665a;
    public final a41 f42666b;

    public w31(a41 a41Var, TLRPC.TL_authorization tL_authorization) {
        this.f42666b = a41Var;
        this.f42665a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        a41.I0(this.f42666b, this.f42665a.country);
        return true;
    }
}
