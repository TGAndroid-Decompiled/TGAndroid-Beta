package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xx implements ValueAnimator.AnimatorUpdateListener {
    public int f43490a;
    public final float f43491b;
    public final float f43492c;
    public final py d;

    public xx(py pyVar, float f10, boolean z4, float f11) {
        this.d = pyVar;
        this.f43491b = f10;
        this.f43492c = f11;
        this.f43490a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f43491b, this.f43492c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f43490a;
        this.f43490a = lerp;
        py pyVar = this.d;
        pyVar.f40185b0[0].f39866a.scrollBy(0, i10);
        View view = pyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
