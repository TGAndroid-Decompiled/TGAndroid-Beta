package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class r61 implements View.OnClickListener {
    public final t61 f41068a;
    public final TLRPC.TL_authorization f41069b;
    public final u61 f41070c;

    public r61(u61 u61Var, t61 t61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41070c = u61Var;
        this.f41068a = t61Var;
        this.f41069b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        t61 t61Var = this.f41068a;
        Switch r02 = t61Var.d;
        r02.c(!r02.h, true);
        this.f41069b.call_requests_disabled = !t61Var.d.h;
        u61.o(this.f41070c);
    }
}
