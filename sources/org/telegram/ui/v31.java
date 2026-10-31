package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v31 implements View.OnClickListener {
    public final TLRPC.TL_authorization f42588a;
    public final c41 f42589b;

    public v31(c41 c41Var, TLRPC.TL_authorization tL_authorization) {
        this.f42589b = c41Var;
        this.f42588a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        c41.I0(this.f42589b, this.f42588a.country);
    }
}
