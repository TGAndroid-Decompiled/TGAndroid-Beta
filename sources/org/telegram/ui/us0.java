package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class us0 extends ViewOutlineProvider {
    public final int f44527a;
    public final float f44528b;
    public final Object f44529c;

    public us0(Object obj, float f7, int i10) {
        this.f44527a = i10;
        this.f44529c = obj;
        this.f44528b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f44527a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f44528b) * ((Float) ((ValueAnimator) this.f44529c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f44528b) * (1.0f - ((PhotoViewer) this.f44529c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
