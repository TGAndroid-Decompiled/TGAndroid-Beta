package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40391a;
    public final z71 f40392b;

    public s71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f40392b = z71Var;
        this.f40391a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        z71.m(this.f40392b, this.f40391a.country);
        return true;
    }
}
