package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class tj extends org.telegram.ui.Components.s11 {
    public final tn f42718e;

    public tj(tn tnVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f42718e = tnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            tn tnVar = this.f42718e;
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (!lVar.s() && !tnVar.A9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            invalidate();
        }
        super.setTranslationY(f9);
    }
}
