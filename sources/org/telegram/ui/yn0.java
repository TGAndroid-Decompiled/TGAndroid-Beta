package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class yn0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.gb gbVar;
        Drawable[] drawableArr = PhotoViewer.Y8;
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32506w;
        if (ccVar != null && (gbVar = ccVar.f32510e) != null) {
            gbVar.updatePosition();
        }
    }
}
