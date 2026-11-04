package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class wo0 extends ViewOutlineProvider {
    public final int f51578a;
    public final float f51579b;
    public final Object f51580c;

    public wo0(Object obj, float f10, int i3) {
        this.f51578a = i3;
        this.f51580c = obj;
        this.f51579b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f51578a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f51579b) * ((Float) ((ValueAnimator) this.f51580c).getAnimatedValue()).floatValue() * org.telegram.messenger.g0.L(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f51579b) * (1.0f - ((PhotoViewer) this.f51580c).X) * org.telegram.messenger.g0.L(10.0f));
                return;
        }
    }
}
