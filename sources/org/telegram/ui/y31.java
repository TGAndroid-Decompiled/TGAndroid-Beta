package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class y31 implements View.OnClickListener {
    public final org.telegram.ui.Components.ag f43552a;
    public final TLRPC.TL_authorization f43553b;
    public final a41 f43554c;

    public y31(a41 a41Var, org.telegram.ui.Components.ag agVar, TLRPC.TL_authorization tL_authorization) {
        this.f43554c = a41Var;
        this.f43552a = agVar;
        this.f43553b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ag agVar = this.f43552a;
        Switch r02 = (Switch) agVar.f24394f;
        r02.c(!r02.h, true);
        this.f43553b.call_requests_disabled = !((Switch) agVar.f24394f).h;
        a41.J0(this.f43554c);
    }
}
