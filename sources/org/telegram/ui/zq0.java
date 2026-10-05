package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f43877a;
    public FrameLayout f43878b;
    public org.telegram.ui.ActionBar.k f43879c;
    public org.telegram.ui.Components.zl0 d;
    public int f43880e;
    public final br0 f43881f;

    public zq0(br0 br0Var, Context context) {
        super(context);
        this.f43881f = br0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        zq0 zq0Var;
        super.setTranslationX(f7);
        br0 br0Var = this.f43881f;
        zq0[] zq0VarArr = br0Var.f35210n;
        if (br0Var.f35212s && (zq0Var = zq0VarArr[0]) == this) {
            br0Var.h.j(Math.abs(zq0Var.getTranslationX()) / zq0VarArr[0].getMeasuredWidth(), zq0VarArr[1].f43880e);
        }
    }
}
