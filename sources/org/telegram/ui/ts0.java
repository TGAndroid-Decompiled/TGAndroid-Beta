package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ts0 extends ViewOutlineProvider {
    public final int f38583a;
    public final float f38584b;
    public final Object f38585c;

    public ts0(Object obj, float f10, int i10) {
        this.f38583a = i10;
        this.f38585c = obj;
        this.f38584b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f38583a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38584b) * ((Float) ((ValueAnimator) this.f38585c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38584b) * (1.0f - ((PhotoViewer) this.f38585c).T) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
