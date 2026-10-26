package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class yu extends FrameLayout {
    public org.telegram.ui.ActionBar.r2 f46111a;
    public FrameLayout f46112b;
    public org.telegram.ui.ActionBar.k f46113c;
    public org.telegram.ui.Components.mm0 d;
    public bi.r1 e;
    public int f46114f;
    public final zu h;

    public yu(zu zuVar, Context context) {
        super(context);
        this.h = zuVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        yu yuVar;
        super.setTranslationX(f7);
        zu zuVar = this.h;
        yu[] yuVarArr = zuVar.f46366f;
        if (zuVar.f46367n && (yuVar = yuVarArr[0]) == this) {
            zuVar.e.i(Math.abs(yuVar.getTranslationX()) / yuVarArr[0].getMeasuredWidth(), yuVarArr[1].f46114f);
        }
    }
}
