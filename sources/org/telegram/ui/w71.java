package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class w71 implements View.OnClickListener {
    public final y71 f38832a;
    public final TLRPC.TL_authorization f38833b;
    public final z71 f38834c;

    public w71(z71 z71Var, y71 y71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38834c = z71Var;
        this.f38832a = y71Var;
        this.f38833b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y71 y71Var = this.f38832a;
        Switch r02 = y71Var.d;
        r02.c(!r02.h, true);
        this.f38833b.call_requests_disabled = !y71Var.d.h;
        z71.n(this.f38834c);
    }
}
