package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f43190a;
    public final a71 f43191b;

    public u61(a71 a71Var, TLRPC.TL_authorization tL_authorization) {
        this.f43191b = a71Var;
        this.f43190a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        a71.m(this.f43191b, this.f43190a.ip);
    }
}
