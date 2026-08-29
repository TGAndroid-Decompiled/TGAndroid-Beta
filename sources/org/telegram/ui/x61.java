package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class x61 implements View.OnClickListener {
    public final z61 f44503a;
    public final TLRPC.TL_authorization f44504b;
    public final a71 f44505c;

    public x61(a71 a71Var, z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.f44505c = a71Var;
        this.f44503a = z61Var;
        this.f44504b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z61 z61Var = this.f44503a;
        Switch r02 = z61Var.d;
        r02.c(!r02.h, true);
        this.f44504b.call_requests_disabled = !z61Var.d.h;
        a71.n(this.f44505c);
    }
}
