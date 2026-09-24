package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yx implements ValueAnimator.AnimatorUpdateListener {
    public int f40249a;
    public final float f40250b;
    public final float f40251c;
    public final qy d;

    public yx(qy qyVar, float f7, boolean z10, float f10) {
        this.d = qyVar;
        this.f40250b = f7;
        this.f40251c = f10;
        this.f40249a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40250b, this.f40251c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40249a;
        this.f40249a = lerp;
        qy qyVar = this.d;
        qyVar.f37021e0[0].f36679a.scrollBy(0, i10);
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
