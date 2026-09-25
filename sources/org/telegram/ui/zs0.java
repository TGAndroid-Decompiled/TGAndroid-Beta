package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 extends ViewOutlineProvider {
    public final int f40574a;
    public final float f40575b;
    public final Object f40576c;

    public zs0(Object obj, float f7, int i10) {
        this.f40574a = i10;
        this.f40576c = obj;
        this.f40575b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40574a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40575b) * ((Float) ((ValueAnimator) this.f40576c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40575b) * (1.0f - ((PhotoViewer) this.f40576c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
