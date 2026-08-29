package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f42288a;
    public final a71 f42289b;

    public s61(a71 a71Var, TLRPC.TL_authorization tL_authorization) {
        this.f42289b = a71Var;
        this.f42288a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        a71.m(this.f42289b, this.f42288a.country);
    }
}
