package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f43372a;
    public final z61 f43373b;

    public s61(z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.f43373b = z61Var;
        this.f43372a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        z61.m(this.f43373b, this.f43372a.country);
        return true;
    }
}
