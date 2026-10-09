package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f44505a;
    public final h81 f44506b;

    public z71(h81 h81Var, TLRPC.TL_authorization tL_authorization) {
        this.f44506b = h81Var;
        this.f44505a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        h81.o(this.f44506b, this.f44505a.country);
    }
}
