package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xx implements ValueAnimator.AnimatorUpdateListener {
    public int f43472a;
    public final float f43473b;
    public final float f43474c;
    public final py d;

    public xx(py pyVar, float f10, boolean z4, float f11) {
        this.d = pyVar;
        this.f43473b = f10;
        this.f43474c = f11;
        this.f43472a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f43473b, this.f43474c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f43472a;
        this.f43472a = lerp;
        py pyVar = this.d;
        pyVar.f40155b0[0].f39822a.scrollBy(0, i10);
        View view = pyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
