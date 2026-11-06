package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zt extends FrameLayout {
    public org.telegram.ui.ActionBar.f2 f52674a;
    public FrameLayout f52675b;
    public org.telegram.ui.ActionBar.k f52676c;
    public org.telegram.ui.Components.pj0 d;
    public bi.q1 f52677e;
    public int f52678f;
    public final au h;

    public zt(au auVar, Context context) {
        super(context);
        this.h = auVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        zt ztVar;
        super.setTranslationX(f10);
        au auVar = this.h;
        zt[] ztVarArr = auVar.f44094f;
        if (auVar.f44095n && (ztVar = ztVarArr[0]) == this) {
            auVar.f44093e.i(Math.abs(ztVar.getTranslationX()) / ztVarArr[0].getMeasuredWidth(), ztVarArr[1].f52678f);
        }
    }
}
