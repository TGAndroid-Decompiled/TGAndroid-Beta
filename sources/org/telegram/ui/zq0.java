package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f43863a;
    public FrameLayout f43864b;
    public org.telegram.ui.ActionBar.k f43865c;
    public org.telegram.ui.Components.zl0 d;
    public int f43866e;
    public final br0 f43867f;

    public zq0(br0 br0Var, Context context) {
        super(context);
        this.f43867f = br0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        zq0 zq0Var;
        super.setTranslationX(f7);
        br0 br0Var = this.f43867f;
        zq0[] zq0VarArr = br0Var.f35181n;
        if (br0Var.f35183s && (zq0Var = zq0VarArr[0]) == this) {
            br0Var.h.j(Math.abs(zq0Var.getTranslationX()) / zq0VarArr[0].getMeasuredWidth(), zq0VarArr[1].f43866e);
        }
    }
}
