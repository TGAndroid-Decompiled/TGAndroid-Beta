package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class w71 implements View.OnClickListener {
    public final y71 f41945a;
    public final TLRPC.TL_authorization f41946b;
    public final z71 f41947c;

    public w71(z71 z71Var, y71 y71Var, TLRPC.TL_authorization tL_authorization) {
        this.f41947c = z71Var;
        this.f41945a = y71Var;
        this.f41946b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y71 y71Var = this.f41945a;
        Switch r02 = y71Var.d;
        r02.c(!r02.h, true);
        this.f41946b.call_requests_disabled = !y71Var.d.h;
        z71.n(this.f41947c);
    }
}
