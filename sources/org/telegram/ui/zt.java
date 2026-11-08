package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zt extends FrameLayout {
    public org.telegram.ui.ActionBar.f2 f52676a;
    public FrameLayout f52677b;
    public org.telegram.ui.ActionBar.k f52678c;
    public org.telegram.ui.Components.pj0 d;
    public bi.q1 f52679e;
    public int f52680f;
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
        zt[] ztVarArr = auVar.f44099f;
        if (auVar.f44100n && (ztVar = ztVarArr[0]) == this) {
            auVar.f44098e.i(Math.abs(ztVar.getTranslationX()) / ztVarArr[0].getMeasuredWidth(), ztVarArr[1].f52680f);
        }
    }
}
