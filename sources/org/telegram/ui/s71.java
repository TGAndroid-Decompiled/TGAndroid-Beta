package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f37329a;
    public final z71 f37330b;

    public s71(z71 z71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37330b = z71Var;
        this.f37329a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        z71.m(this.f37330b, this.f37329a.country);
        return true;
    }
}
