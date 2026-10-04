package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f41077a;
    public final z71 f41078b;

    public u71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f41078b = z71Var;
        this.f41077a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        z71.m(this.f41078b, this.f41077a.country);
        return true;
    }
}
