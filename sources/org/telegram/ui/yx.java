package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yx implements ValueAnimator.AnimatorUpdateListener {
    public int f40350a;
    public final float f40351b;
    public final float f40352c;
    public final qy d;

    public yx(qy qyVar, float f10, boolean z4, float f11) {
        this.d = qyVar;
        this.f40351b = f10;
        this.f40352c = f11;
        this.f40350a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40351b, this.f40352c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40350a;
        this.f40350a = lerp;
        qy qyVar = this.d;
        qyVar.f37527b0[0].f37246a.scrollBy(0, i10);
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
