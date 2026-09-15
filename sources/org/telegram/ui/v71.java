package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f38385a;
    public final d81 f38386b;

    public v71(d81 d81Var, TLRPC.TL_authorization tL_authorization) {
        this.f38386b = d81Var;
        this.f38385a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        d81.m(this.f38386b, this.f38385a.country);
    }
}
