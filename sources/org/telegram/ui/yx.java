package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yx implements ValueAnimator.AnimatorUpdateListener {
    public int f40375a;
    public final float f40376b;
    public final float f40377c;
    public final qy d;

    public yx(qy qyVar, float f7, boolean z10, float f10) {
        this.d = qyVar;
        this.f40376b = f7;
        this.f40377c = f10;
        this.f40375a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40376b, this.f40377c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40375a;
        this.f40375a = lerp;
        qy qyVar = this.d;
        qyVar.f37134e0[0].f36794a.scrollBy(0, i10);
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
