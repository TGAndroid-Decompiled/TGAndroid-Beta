package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f37619a;
    public final x71 f37620b;

    public s71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37620b = x71Var;
        this.f37619a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x71.m(this.f37620b, this.f37619a.country);
        return true;
    }
}
