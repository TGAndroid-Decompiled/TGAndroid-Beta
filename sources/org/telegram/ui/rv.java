package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class rv extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f39591a;
    public FrameLayout f39592b;
    public org.telegram.ui.ActionBar.k f39593c;
    public org.telegram.ui.Components.mm0 d;
    public bi.o0 e;
    public int f39594f;
    public final sv h;

    public rv(sv svVar, Context context) {
        super(context);
        this.h = svVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        rv rvVar;
        super.setTranslationX(f7);
        sv svVar = this.h;
        rv[] rvVarArr = svVar.f39952f;
        if (svVar.f39953n && (rvVar = rvVarArr[0]) == this) {
            svVar.e.j(Math.abs(rvVar.getTranslationX()) / rvVarArr[0].getMeasuredWidth(), rvVarArr[1].f39594f);
        }
    }
}
