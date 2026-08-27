package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

public final class sj extends org.telegram.ui.Components.i11 {

    public final rn f42655e;

    public sj(rn rnVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f42655e = rnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() == 0.0f) {
            return false;
        }
        rn rnVar = this.f42655e;
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
