package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class y11 implements View.OnClickListener {
    public final org.telegram.ui.Components.cg f52158a;
    public final TLRPC.TL_authorization f52159b;
    public final b21 f52160c;

    public y11(b21 b21Var, org.telegram.ui.Components.cg cgVar, TLRPC.TL_authorization tL_authorization) {
        this.f52160c = b21Var;
        this.f52158a = cgVar;
        this.f52159b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.cg cgVar = this.f52158a;
        Switch r02 = (Switch) cgVar.f32704f;
        r02.c(!r02.h, true);
        this.f52159b.encrypted_requests_disabled = !((Switch) cgVar.f32704f).h;
        b21.J0(this.f52160c);
    }
}
