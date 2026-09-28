package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yx implements ValueAnimator.AnimatorUpdateListener {
    public int f40266a;
    public final float f40267b;
    public final float f40268c;
    public final qy d;

    public yx(qy qyVar, float f7, boolean z10, float f10) {
        this.d = qyVar;
        this.f40267b = f7;
        this.f40268c = f10;
        this.f40266a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40267b, this.f40268c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40266a;
        this.f40266a = lerp;
        qy qyVar = this.d;
        qyVar.f37034e0[0].f36695a.scrollBy(0, i10);
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
