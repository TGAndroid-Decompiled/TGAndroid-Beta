package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class ur0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.vb vbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f27939w;
        if (rcVar != null && (vbVar = rcVar.e) != null) {
            vbVar.updatePosition();
        }
    }
}
