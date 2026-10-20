package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class vj extends org.telegram.ui.Components.x21 {
    public final qn e;

    public vj(qn qnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = qnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            qn qnVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            if (!kVar.t() && !qnVar.F9()) {
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
