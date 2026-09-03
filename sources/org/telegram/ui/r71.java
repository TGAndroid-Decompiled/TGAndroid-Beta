package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class r71 implements View.OnClickListener {
    public final t71 f40767a;
    public final TLRPC.TL_authorization f40768b;
    public final u71 f40769c;

    public r71(u71 u71Var, t71 t71Var, TLRPC.TL_authorization tL_authorization) {
        this.f40769c = u71Var;
        this.f40767a = t71Var;
        this.f40768b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        t71 t71Var = this.f40767a;
        Switch r02 = t71Var.d;
        r02.c(!r02.h, true);
        this.f40768b.call_requests_disabled = !t71Var.d.h;
        u71.n(this.f40769c);
    }
}
