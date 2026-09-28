package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 extends ViewOutlineProvider {
    public final int f40573a;
    public final float f40574b;
    public final Object f40575c;

    public zs0(Object obj, float f7, int i10) {
        this.f40573a = i10;
        this.f40575c = obj;
        this.f40574b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40573a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40574b) * ((Float) ((ValueAnimator) this.f40575c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40574b) * (1.0f - ((PhotoViewer) this.f40575c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
