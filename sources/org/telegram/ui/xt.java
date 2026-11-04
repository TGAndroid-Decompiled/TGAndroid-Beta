package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class xt extends FrameLayout {
    public org.telegram.ui.ActionBar.d2 f52096a;
    public FrameLayout f52097b;
    public org.telegram.ui.ActionBar.k f52098c;
    public org.telegram.ui.Components.tj0 d;
    public ci.j1 f52099e;
    public int f52100f;
    public final yt h;

    public xt(yt ytVar, Context context) {
        super(context);
        this.h = ytVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        xt xtVar;
        super.setTranslationX(f10);
        yt ytVar = this.h;
        xt[] xtVarArr = ytVar.f52403f;
        if (ytVar.f52404n && (xtVar = xtVarArr[0]) == this) {
            ytVar.f52402e.i(Math.abs(xtVar.getTranslationX()) / xtVarArr[0].getMeasuredWidth(), xtVarArr[1].f52100f);
        }
    }
}
