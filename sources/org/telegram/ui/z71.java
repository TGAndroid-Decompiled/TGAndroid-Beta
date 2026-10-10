package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f44551a;
    public final h81 f44552b;

    public z71(h81 h81Var, TLRPC.TL_authorization tL_authorization) {
        this.f44552b = h81Var;
        this.f44551a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        h81.o(this.f44552b, this.f44551a.country);
    }
}
