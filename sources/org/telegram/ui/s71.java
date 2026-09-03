package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class s71 implements View.OnClickListener {
    public final u71 f38117a;
    public final TLRPC.TL_authorization f38118b;
    public final v71 f38119c;

    public s71(v71 v71Var, u71 u71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38119c = v71Var;
        this.f38117a = u71Var;
        this.f38118b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        u71 u71Var = this.f38117a;
        Switch r02 = u71Var.d;
        r02.c(!r02.h, true);
        this.f38118b.call_requests_disabled = !u71Var.d.h;
        v71.n(this.f38119c);
    }
}
