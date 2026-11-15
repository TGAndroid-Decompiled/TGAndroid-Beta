package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class yn0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.cb cbVar;
        Drawable[] drawableArr = PhotoViewer.Z8;
        org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41627w;
        if (xbVar != null && (cbVar = xbVar.f41631e) != null) {
            cbVar.updatePosition();
        }
    }
}
