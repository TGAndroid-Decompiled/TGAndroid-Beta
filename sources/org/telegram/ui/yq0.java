package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class yq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39871a;
    public FrameLayout f39872b;
    public org.telegram.ui.ActionBar.k f39873c;
    public org.telegram.ui.Components.ml0 d;
    public int e;
    public final ar0 f39874f;

    public yq0(ar0 ar0Var, Context context) {
        super(context);
        this.f39874f = ar0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        yq0 yq0Var;
        super.setTranslationX(f7);
        ar0 ar0Var = this.f39874f;
        yq0[] yq0VarArr = ar0Var.f31871n;
        if (ar0Var.f31873s && (yq0Var = yq0VarArr[0]) == this) {
            ar0Var.h.j(Math.abs(yq0Var.getTranslationX()) / yq0VarArr[0].getMeasuredWidth(), yq0VarArr[1].e);
        }
    }
}
