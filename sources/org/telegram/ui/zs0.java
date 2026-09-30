package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 extends ViewOutlineProvider {
    public final int f40575a;
    public final float f40576b;
    public final Object f40577c;

    public zs0(Object obj, float f7, int i10) {
        this.f40575a = i10;
        this.f40577c = obj;
        this.f40576b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40575a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40576b) * ((Float) ((ValueAnimator) this.f40577c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40576b) * (1.0f - ((PhotoViewer) this.f40577c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
