package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class yu extends FrameLayout {
    public org.telegram.ui.ActionBar.r2 f46108a;
    public FrameLayout f46109b;
    public org.telegram.ui.ActionBar.k f46110c;
    public org.telegram.ui.Components.mm0 d;
    public bi.r1 e;
    public int f46111f;
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
        yu[] yuVarArr = zuVar.f46363f;
        if (zuVar.f46364n && (yuVar = yuVarArr[0]) == this) {
            zuVar.e.i(Math.abs(yuVar.getTranslationX()) / yuVarArr[0].getMeasuredWidth(), yuVarArr[1].f46111f);
        }
    }
}
