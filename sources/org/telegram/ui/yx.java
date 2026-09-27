package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yx implements ValueAnimator.AnimatorUpdateListener {
    public int f40347a;
    public final float f40348b;
    public final float f40349c;
    public final ty d;

    public yx(ty tyVar, float f7, boolean z10, float f10) {
        this.d = tyVar;
        this.f40348b = f7;
        this.f40349c = f10;
        this.f40347a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40348b, this.f40349c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40347a;
        this.f40347a = lerp;
        ty tyVar = this.d;
        tyVar.f37976e0[0].f37593a.scrollBy(0, i10);
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
