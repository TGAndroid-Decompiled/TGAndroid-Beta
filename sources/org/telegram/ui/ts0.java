package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ts0 extends ViewOutlineProvider {
    public final int f41628a;
    public final float f41629b;
    public final Object f41630c;

    public ts0(Object obj, float f10, int i10) {
        this.f41628a = i10;
        this.f41630c = obj;
        this.f41629b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f41628a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f41629b) * ((Float) ((ValueAnimator) this.f41630c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f41629b) * (1.0f - ((PhotoViewer) this.f41630c).T) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
