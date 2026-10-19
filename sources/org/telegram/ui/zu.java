package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zu extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f43798a;
    public FrameLayout f43799b;
    public org.telegram.ui.ActionBar.k f43800c;
    public org.telegram.ui.Components.im0 d;
    public ai.u1 e;
    public int f43801f;
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
        zu[] zuVarArr = avVar.f35424f;
        if (avVar.f35425n && (zuVar = zuVarArr[0]) == this) {
            avVar.e.j(Math.abs(zuVar.getTranslationX()) / zuVarArr[0].getMeasuredWidth(), zuVarArr[1].f43801f);
        }
    }
}
