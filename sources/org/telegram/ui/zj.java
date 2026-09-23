package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class zj extends org.telegram.ui.Components.z11 {
    public final xn e;

    public zj(xn xnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = xnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            xn xnVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
            if (!kVar.s() && !xnVar.A9()) {
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
