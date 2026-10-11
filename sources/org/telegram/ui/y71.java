package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f44277a;
    public final g81 f44278b;

    public y71(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f44278b = g81Var;
        this.f44277a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.o(this.f44278b, this.f44277a.country);
    }
}
