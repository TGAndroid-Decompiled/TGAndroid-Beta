package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class wq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f39742a;
    public FrameLayout f39743b;
    public org.telegram.ui.ActionBar.k f39744c;
    public org.telegram.ui.Components.xl0 d;
    public int e;
    public final yq0 f39745f;

    public wq0(yq0 yq0Var, Context context) {
        super(context);
        this.f39745f = yq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        wq0 wq0Var;
        super.setTranslationX(f7);
        yq0 yq0Var = this.f39745f;
        wq0[] wq0VarArr = yq0Var.f40228n;
        if (yq0Var.f40230s && (wq0Var = wq0VarArr[0]) == this) {
            yq0Var.h.j(Math.abs(wq0Var.getTranslationX()) / wq0VarArr[0].getMeasuredWidth(), wq0VarArr[1].e);
        }
    }
}
