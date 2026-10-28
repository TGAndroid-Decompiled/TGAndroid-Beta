package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f44194a;
    public final c71 f44195b;

    public v61(c71 c71Var, TLRPC.TL_authorization tL_authorization) {
        this.f44195b = c71Var;
        this.f44194a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        c71.m(this.f44195b, this.f44194a.country);
        return true;
    }
}
