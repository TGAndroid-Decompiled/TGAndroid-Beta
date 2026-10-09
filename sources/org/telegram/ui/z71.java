package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f44507a;
    public final h81 f44508b;

    public z71(h81 h81Var, TLRPC.TL_authorization tL_authorization) {
        this.f44508b = h81Var;
        this.f44507a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        h81.o(this.f44508b, this.f44507a.country);
    }
}
