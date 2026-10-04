package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class zj extends org.telegram.ui.Components.y21 {
    public final yn f43839e;

    public zj(yn ynVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f43839e = ynVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            yn ynVar = this.f43839e;
            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            if (!kVar.s() && !ynVar.z9()) {
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
