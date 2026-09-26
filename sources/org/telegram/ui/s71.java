package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f37618a;
    public final x71 f37619b;

    public s71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37619b = x71Var;
        this.f37618a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x71.m(this.f37619b, this.f37618a.country);
        return true;
    }
}
