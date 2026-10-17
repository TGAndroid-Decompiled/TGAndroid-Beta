package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class xj extends org.telegram.ui.Components.v21 {
    public final sn e;

    public xj(sn snVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = snVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            sn snVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
            if (!kVar.s() && !snVar.F9()) {
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
