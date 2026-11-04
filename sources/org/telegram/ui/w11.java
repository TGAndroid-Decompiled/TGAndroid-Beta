package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w11 implements View.OnClickListener {
    public final TLRPC.TL_authorization f50666a;
    public final b21 f50667b;

    public w11(b21 b21Var, TLRPC.TL_authorization tL_authorization) {
        this.f50667b = b21Var;
        this.f50666a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        b21.I0(this.f50667b, this.f50666a.ip);
    }
}
