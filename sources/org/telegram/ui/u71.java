package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f38144a;
    public final z71 f38145b;

    public u71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38145b = z71Var;
        this.f38144a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        z71.m(this.f38145b, this.f38144a.country);
        return true;
    }
}
