package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wx implements ValueAnimator.AnimatorUpdateListener {
    public int f39807a;
    public final float f39808b;
    public final float f39809c;
    public final oy d;

    public wx(oy oyVar, float f10, boolean z4, float f11) {
        this.d = oyVar;
        this.f39808b = f10;
        this.f39809c = f11;
        this.f39807a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f39808b, this.f39809c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f39807a;
        this.f39807a = lerp;
        oy oyVar = this.d;
        oyVar.f37009b0[0].f36741a.scrollBy(0, i10);
        View view = oyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
