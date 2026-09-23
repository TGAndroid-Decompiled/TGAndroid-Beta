package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zx implements ValueAnimator.AnimatorUpdateListener {
    public int f40261a;
    public final float f40262b;
    public final float f40263c;
    public final ry d;

    public zx(ry ryVar, float f7, boolean z10, float f10) {
        this.d = ryVar;
        this.f40262b = f7;
        this.f40263c = f10;
        this.f40261a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40262b, this.f40263c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40261a;
        this.f40261a = lerp;
        ry ryVar = this.d;
        ryVar.f36978e0[0].f36629a.scrollBy(0, i10);
        View view = ryVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
