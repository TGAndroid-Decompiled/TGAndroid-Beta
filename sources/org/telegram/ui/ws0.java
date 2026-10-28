package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ws0 extends ViewOutlineProvider {
    public final int f45395a;
    public final float f45396b;
    public final Object f45397c;

    public ws0(Object obj, float f7, int i10) {
        this.f45395a = i10;
        this.f45397c = obj;
        this.f45396b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f45395a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f45396b) * ((Float) ((ValueAnimator) this.f45397c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f45396b) * (1.0f - ((PhotoViewer) this.f45397c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
