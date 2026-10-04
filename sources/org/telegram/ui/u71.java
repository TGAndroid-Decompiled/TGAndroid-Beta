package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f41076a;
    public final z71 f41077b;

    public u71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f41077b = z71Var;
        this.f41076a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        z71.m(this.f41077b, this.f41076a.country);
        return true;
    }
}
