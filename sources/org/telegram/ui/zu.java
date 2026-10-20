package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zu extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f43804a;
    public FrameLayout f43805b;
    public org.telegram.ui.ActionBar.k f43806c;
    public org.telegram.ui.Components.jm0 d;
    public ai.u1 e;
    public int f43807f;
    public final av h;

    public zu(av avVar, Context context) {
        super(context);
        this.h = avVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        zu zuVar;
        super.setTranslationX(f7);
        av avVar = this.h;
        zu[] zuVarArr = avVar.f35430f;
        if (avVar.f35431n && (zuVar = zuVarArr[0]) == this) {
            avVar.e.j(Math.abs(zuVar.getTranslationX()) / zuVarArr[0].getMeasuredWidth(), zuVarArr[1].f43807f);
        }
    }
}
