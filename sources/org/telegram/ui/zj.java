package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class zj extends org.telegram.ui.Components.o21 {
    public final wn e;

    public zj(wn wnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = wnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            wn wnVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if (!kVar.s() && !wnVar.A9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
