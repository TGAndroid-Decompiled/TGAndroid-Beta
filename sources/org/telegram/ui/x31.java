package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x31 implements View.OnClickListener {
    public final TLRPC.TL_authorization f43432a;
    public final c41 f43433b;

    public x31(c41 c41Var, TLRPC.TL_authorization tL_authorization) {
        this.f43433b = c41Var;
        this.f43432a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        c41.I0(this.f43433b, this.f43432a.ip);
    }
}
