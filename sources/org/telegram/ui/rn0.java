package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class rn0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.fb fbVar;
        Drawable[] drawableArr = PhotoViewer.V8;
        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
        if (acVar != null && (fbVar = acVar.f31788e) != null) {
            fbVar.updatePosition();
        }
    }
}
