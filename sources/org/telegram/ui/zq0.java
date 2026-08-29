package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class zq0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.rb rbVar;
        Drawable[] drawableArr = PhotoViewer.P8;
        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
        if (mcVar != null && (rbVar = mcVar.f30648e) != null) {
            rbVar.updatePosition();
        }
    }
}
