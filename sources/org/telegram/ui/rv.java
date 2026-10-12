package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class rv extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f39871a;
    public FrameLayout f39872b;
    public org.telegram.ui.ActionBar.k f39873c;
    public org.telegram.ui.Components.mm0 d;
    public bi.o0 e;
    public int f39874f;
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
        rv[] rvVarArr = svVar.f40220f;
        if (svVar.f40221n && (rvVar = rvVarArr[0]) == this) {
            svVar.e.j(Math.abs(rvVar.getTranslationX()) / rvVarArr[0].getMeasuredWidth(), rvVarArr[1].f39874f);
        }
    }
}
