package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class yj extends org.telegram.ui.Components.l31 {
    public final wn e;

    public yj(wn wnVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.e = wnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            wn wnVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            if (!kVar.q() && !wnVar.M9()) {
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
