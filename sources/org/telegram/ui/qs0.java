package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class qs0 extends ViewOutlineProvider {
    public final int f40912a;
    public final float f40913b;
    public final Object f40914c;

    public qs0(Object obj, float f7, int i10) {
        this.f40912a = i10;
        this.f40914c = obj;
        this.f40913b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40912a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40913b) * ((Float) ((ValueAnimator) this.f40914c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40913b) * (1.0f - ((PhotoViewer) this.f40914c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
