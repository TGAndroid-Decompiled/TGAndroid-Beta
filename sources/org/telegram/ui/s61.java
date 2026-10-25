package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f43369a;
    public final z61 f43370b;

    public s61(z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.f43370b = z61Var;
        this.f43369a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        z61.m(this.f43370b, this.f43369a.country);
        return true;
    }
}
