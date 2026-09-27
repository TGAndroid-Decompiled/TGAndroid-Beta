package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class v71 implements View.OnClickListener {
    public final y71 f38478a;
    public final TLRPC.TL_authorization f38479b;
    public final z71 f38480c;

    public v71(z71 z71Var, y71 y71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38480c = z71Var;
        this.f38478a = y71Var;
        this.f38479b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y71 y71Var = this.f38478a;
        Switch r02 = y71Var.d;
        r02.c(!r02.h, true);
        this.f38479b.encrypted_requests_disabled = !y71Var.d.h;
        z71.n(this.f38480c);
    }
}
