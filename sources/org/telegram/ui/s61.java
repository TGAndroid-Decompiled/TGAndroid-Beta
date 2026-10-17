package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class s61 implements View.OnClickListener {
    public final v61 f41025a;
    public final TLRPC.TL_authorization f41026b;
    public final w61 f41027c;

    public s61(w61 w61Var, v61 v61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41027c = w61Var;
        this.f41025a = v61Var;
        this.f41026b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        v61 v61Var = this.f41025a;
        Switch r02 = v61Var.d;
        r02.c(!r02.h, true);
        this.f41026b.encrypted_requests_disabled = !v61Var.d.h;
        w61.o(this.f41027c);
    }
}
