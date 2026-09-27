package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f40578a;
    public FrameLayout f40579b;
    public org.telegram.ui.ActionBar.l f40580c;
    public org.telegram.ui.Components.yl0 d;
    public int e;
    public final br0 f40581f;

    public zq0(br0 br0Var, Context context) {
        super(context);
        this.f40581f = br0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        zq0 zq0Var;
        super.setTranslationX(f7);
        br0 br0Var = this.f40581f;
        zq0[] zq0VarArr = br0Var.f32423n;
        if (br0Var.f32425s && (zq0Var = zq0VarArr[0]) == this) {
            br0Var.h.j(Math.abs(zq0Var.getTranslationX()) / zq0VarArr[0].getMeasuredWidth(), zq0VarArr[1].e);
        }
    }
}
