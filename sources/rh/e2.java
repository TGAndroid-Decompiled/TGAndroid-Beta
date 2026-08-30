package rh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f43501a;
    public final float f43502b;
    public final float f43503c;
    public final float d;
    public final float e;
    public final q2 f43504f;

    public e2(q2 q2Var, boolean z4, float f10, float f11, float f12, float f13) {
        this.f43504f = q2Var;
        this.f43501a = z4;
        this.f43502b = f10;
        this.f43503c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        q2 q2Var = this.f43504f;
        i2 i2Var = q2Var.f43708x;
        n2 n2Var = q2Var.T;
        h2 h2Var = q2Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        q2Var.f43684d0 = floatValue;
        if (!this.f43501a) {
            floatValue = 1.0f - floatValue;
        }
        q2Var.f43683c0 = floatValue;
        n2Var.setAlpha(1.0f - floatValue);
        n2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * q2Var.f43683c0);
        float f10 = this.f43502b;
        float f11 = q2Var.f43684d0;
        float f12 = this.f43503c;
        h2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        h2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, q2Var.f43684d0));
        q2Var.f43690i0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, q2Var.f43684d0));
        q2Var.f43691j0.setAlpha(q2Var.f43683c0);
        q2Var.e.invalidate();
        i2Var.setViewPortHeightOffset(h2Var.getTranslationY() - f12);
        i2Var.n(false, false);
        q2Var.C();
    }
}
