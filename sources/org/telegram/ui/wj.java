package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class wj extends org.telegram.ui.Components.k31 {
    public final un e;

    public wj(un unVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.e = unVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            un unVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if (!kVar.q() && !unVar.J9()) {
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
