package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class r71 implements View.OnClickListener {
    public final u71 f37729a;
    public final TLRPC.TL_authorization f37730b;
    public final v71 f37731c;

    public r71(v71 v71Var, u71 u71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37731c = v71Var;
        this.f37729a = u71Var;
        this.f37730b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        u71 u71Var = this.f37729a;
        Switch r02 = u71Var.d;
        r02.c(!r02.h, true);
        this.f37730b.encrypted_requests_disabled = !u71Var.d.h;
        v71.n(this.f37731c);
    }
}
