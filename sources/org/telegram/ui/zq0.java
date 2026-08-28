package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class zq0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.lb lbVar;
        Drawable[] drawableArr = PhotoViewer.P8;
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
        if (gcVar != null && (lbVar = gcVar.f28733e) != null) {
            lbVar.updatePosition();
        }
    }
}
