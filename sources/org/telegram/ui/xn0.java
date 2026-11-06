package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class xn0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.gb gbVar;
        Drawable[] drawableArr = PhotoViewer.Y8;
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32515w;
        if (ccVar != null && (gbVar = ccVar.f32519e) != null) {
            gbVar.updatePosition();
        }
    }
}
