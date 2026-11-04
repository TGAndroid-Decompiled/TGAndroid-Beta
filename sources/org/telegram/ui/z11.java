package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class z11 implements View.OnClickListener {
    public final org.telegram.ui.Components.cg f52503a;
    public final TLRPC.TL_authorization f52504b;
    public final b21 f52505c;

    public z11(b21 b21Var, org.telegram.ui.Components.cg cgVar, TLRPC.TL_authorization tL_authorization) {
        this.f52505c = b21Var;
        this.f52503a = cgVar;
        this.f52504b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.cg cgVar = this.f52503a;
        Switch r02 = (Switch) cgVar.f32704f;
        r02.c(!r02.h, true);
        this.f52504b.call_requests_disabled = !((Switch) cgVar.f32704f).h;
        b21.J0(this.f52505c);
    }
}
