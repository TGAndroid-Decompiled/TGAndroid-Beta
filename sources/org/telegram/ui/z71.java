package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class z71 implements View.OnClickListener {
    public final c81 f40101a;
    public final TLRPC.TL_authorization f40102b;
    public final d81 f40103c;

    public z71(d81 d81Var, c81 c81Var, TLRPC.TL_authorization tL_authorization) {
        this.f40103c = d81Var;
        this.f40101a = c81Var;
        this.f40102b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        c81 c81Var = this.f40101a;
        Switch r02 = c81Var.d;
        r02.c(!r02.h, true);
        this.f40102b.encrypted_requests_disabled = !c81Var.d.h;
        d81.n(this.f40103c);
    }
}
