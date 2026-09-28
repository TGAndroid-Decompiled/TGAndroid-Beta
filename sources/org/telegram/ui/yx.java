package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yx implements ValueAnimator.AnimatorUpdateListener {
    public int f40265a;
    public final float f40266b;
    public final float f40267c;
    public final qy d;

    public yx(qy qyVar, float f7, boolean z10, float f10) {
        this.d = qyVar;
        this.f40266b = f7;
        this.f40267c = f10;
        this.f40265a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40266b, this.f40267c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40265a;
        this.f40265a = lerp;
        qy qyVar = this.d;
        qyVar.f37033e0[0].f36694a.scrollBy(0, i10);
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
