package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v11 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f50365a;
    public final b21 f50366b;

    public v11(b21 b21Var, TLRPC.TL_authorization tL_authorization) {
        this.f50366b = b21Var;
        this.f50365a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        b21.I0(this.f50366b, this.f50365a.country);
        return true;
    }
}
