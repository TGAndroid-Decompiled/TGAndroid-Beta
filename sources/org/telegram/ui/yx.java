package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yx implements ValueAnimator.AnimatorUpdateListener {
    public int f40264a;
    public final float f40265b;
    public final float f40266c;
    public final qy d;

    public yx(qy qyVar, float f7, boolean z10, float f10) {
        this.d = qyVar;
        this.f40265b = f7;
        this.f40266c = f10;
        this.f40264a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40265b, this.f40266c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40264a;
        this.f40264a = lerp;
        qy qyVar = this.d;
        qyVar.f37032e0[0].f36693a.scrollBy(0, i10);
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
