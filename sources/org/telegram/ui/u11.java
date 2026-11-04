package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u11 implements View.OnClickListener {
    public final TLRPC.TL_authorization f49942a;
    public final b21 f49943b;

    public u11(b21 b21Var, TLRPC.TL_authorization tL_authorization) {
        this.f49943b = b21Var;
        this.f49942a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        b21.I0(this.f49943b, this.f49942a.country);
    }
}
