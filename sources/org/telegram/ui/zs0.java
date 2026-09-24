package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 extends ViewOutlineProvider {
    public final int f40559a;
    public final float f40560b;
    public final Object f40561c;

    public zs0(Object obj, float f7, int i10) {
        this.f40559a = i10;
        this.f40561c = obj;
        this.f40560b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40559a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40560b) * ((Float) ((ValueAnimator) this.f40561c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40560b) * (1.0f - ((PhotoViewer) this.f40561c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
