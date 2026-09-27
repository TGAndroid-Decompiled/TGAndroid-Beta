package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f37670a;
    public final z71 f37671b;

    public t71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37671b = z71Var;
        this.f37670a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        z71.m(this.f37671b, this.f37670a.ip);
    }
}
