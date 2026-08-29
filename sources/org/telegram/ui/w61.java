package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class w61 implements View.OnClickListener {
    public final z61 f43852a;
    public final TLRPC.TL_authorization f43853b;
    public final a71 f43854c;

    public w61(a71 a71Var, z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.f43854c = a71Var;
        this.f43852a = z61Var;
        this.f43853b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z61 z61Var = this.f43852a;
        Switch r02 = z61Var.d;
        r02.c(!r02.h, true);
        this.f43853b.encrypted_requests_disabled = !z61Var.d.h;
        a71.n(this.f43854c);
    }
}
