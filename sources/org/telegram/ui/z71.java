package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f44601a;
    public final g81 f44602b;

    public z71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f44602b = g81Var;
        this.f44601a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.o(this.f44602b, this.f44601a.country);
        return true;
    }
}
