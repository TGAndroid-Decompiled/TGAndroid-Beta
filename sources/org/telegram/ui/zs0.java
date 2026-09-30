package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 extends ViewOutlineProvider {
    public final int f40672a;
    public final float f40673b;
    public final Object f40674c;

    public zs0(Object obj, float f7, int i10) {
        this.f40672a = i10;
        this.f40674c = obj;
        this.f40673b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40672a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40673b) * ((Float) ((ValueAnimator) this.f40674c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40673b) * (1.0f - ((PhotoViewer) this.f40674c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
