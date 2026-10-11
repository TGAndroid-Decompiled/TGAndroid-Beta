package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f44311a;
    public final g81 f44312b;

    public y71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f44312b = g81Var;
        this.f44311a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.o(this.f44312b, this.f44311a.country);
    }
}
