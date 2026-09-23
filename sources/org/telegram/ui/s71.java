package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class s71 implements View.OnClickListener {
    public final v71 f37146a;
    public final TLRPC.TL_authorization f37147b;
    public final w71 f37148c;

    public s71(w71 w71Var, v71 v71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37148c = w71Var;
        this.f37146a = v71Var;
        this.f37147b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        v71 v71Var = this.f37146a;
        Switch r02 = v71Var.d;
        r02.c(!r02.h, true);
        this.f37147b.encrypted_requests_disabled = !v71Var.d.h;
        w71.n(this.f37148c);
    }
}
