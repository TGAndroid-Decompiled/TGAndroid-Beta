package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class us0 extends ViewOutlineProvider {
    public final int f44524a;
    public final float f44525b;
    public final Object f44526c;

    public us0(Object obj, float f7, int i10) {
        this.f44524a = i10;
        this.f44526c = obj;
        this.f44525b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f44524a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f44525b) * ((Float) ((ValueAnimator) this.f44526c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f44525b) * (1.0f - ((PhotoViewer) this.f44526c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
