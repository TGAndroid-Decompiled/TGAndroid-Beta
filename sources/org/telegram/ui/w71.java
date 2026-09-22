package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f38719a;
    public final e81 f38720b;

    public w71(e81 e81Var, TLRPC.TL_authorization tL_authorization) {
        this.f38720b = e81Var;
        this.f38719a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        e81.m(this.f38720b, this.f38719a.country);
    }
}
