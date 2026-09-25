package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class wq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f39744a;
    public FrameLayout f39745b;
    public org.telegram.ui.ActionBar.k f39746c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public final yq0 f39747f;

    public wq0(yq0 yq0Var, Context context) {
        super(context);
        this.f39747f = yq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        wq0 wq0Var;
        super.setTranslationX(f7);
        yq0 yq0Var = this.f39747f;
        wq0[] wq0VarArr = yq0Var.f40230n;
        if (yq0Var.f40232s && (wq0Var = wq0VarArr[0]) == this) {
            yq0Var.h.j(Math.abs(wq0Var.getTranslationX()) / wq0VarArr[0].getMeasuredWidth(), wq0VarArr[1].e);
        }
    }
}
