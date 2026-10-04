package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class v71 implements View.OnClickListener {
    public final y71 f41588a;
    public final TLRPC.TL_authorization f41589b;
    public final z71 f41590c;

    public v71(z71 z71Var, y71 y71Var, TLRPC.TL_authorization tL_authorization) {
        this.f41590c = z71Var;
        this.f41588a = y71Var;
        this.f41589b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y71 y71Var = this.f41588a;
        Switch r02 = y71Var.d;
        r02.c(!r02.h, true);
        this.f41589b.encrypted_requests_disabled = !y71Var.d.h;
        z71.n(this.f41590c);
    }
}
