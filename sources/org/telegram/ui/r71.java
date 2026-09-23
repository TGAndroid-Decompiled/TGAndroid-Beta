package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36719a;
    public final w71 f36720b;

    public r71(w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f36720b = w71Var;
        this.f36719a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        w71.m(this.f36720b, this.f36719a.country);
        return true;
    }
}
