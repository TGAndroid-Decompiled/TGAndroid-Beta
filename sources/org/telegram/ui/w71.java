package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class w71 implements View.OnClickListener {
    public final y71 f41944a;
    public final TLRPC.TL_authorization f41945b;
    public final z71 f41946c;

    public w71(z71 z71Var, y71 y71Var, TLRPC.TL_authorization tL_authorization) {
        this.f41946c = z71Var;
        this.f41944a = y71Var;
        this.f41945b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y71 y71Var = this.f41944a;
        Switch r02 = y71Var.d;
        r02.c(!r02.h, true);
        this.f41945b.call_requests_disabled = !y71Var.d.h;
        z71.n(this.f41946c);
    }
}
