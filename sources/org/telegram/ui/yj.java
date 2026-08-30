package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class yj extends org.telegram.ui.Components.c21 {
    public final xn e;

    public yj(xn xnVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = xnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            xn xnVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if (!kVar.s() && !xnVar.A9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
