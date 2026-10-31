package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class z31 implements View.OnClickListener {
    public final org.telegram.ui.Components.ag f44004a;
    public final TLRPC.TL_authorization f44005b;
    public final c41 f44006c;

    public z31(c41 c41Var, org.telegram.ui.Components.ag agVar, TLRPC.TL_authorization tL_authorization) {
        this.f44006c = c41Var;
        this.f44004a = agVar;
        this.f44005b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ag agVar = this.f44004a;
        Switch r02 = (Switch) agVar.f24410f;
        r02.c(!r02.h, true);
        this.f44005b.encrypted_requests_disabled = !((Switch) agVar.f24410f).h;
        c41.J0(this.f44006c);
    }
}
