package sh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f47386a;
    public final float f47387b;
    public final float f47388c;
    public final float d;
    public final float f47389e;
    public final p2 f47390f;

    public d2(p2 p2Var, boolean z4, float f10, float f11, float f12, float f13) {
        this.f47390f = p2Var;
        this.f47386a = z4;
        this.f47387b = f10;
        this.f47388c = f11;
        this.d = f12;
        this.f47389e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        p2 p2Var = this.f47390f;
        h2 h2Var = p2Var.f47612x;
        m2 m2Var = p2Var.T;
        g2 g2Var = p2Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p2Var.f47587d0 = floatValue;
        if (!this.f47386a) {
            floatValue = 1.0f - floatValue;
        }
        p2Var.f47586c0 = floatValue;
        m2Var.setAlpha(1.0f - floatValue);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * p2Var.f47586c0);
        float f10 = this.f47387b;
        float f11 = p2Var.f47587d0;
        float f12 = this.f47388c;
        g2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        g2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, p2Var.f47587d0));
        p2Var.f47594i0.setTranslationX(AndroidUtilities.lerp(this.f47389e, 0.0f, p2Var.f47587d0));
        p2Var.f47595j0.setAlpha(p2Var.f47586c0);
        p2Var.f47588e.invalidate();
        h2Var.setViewPortHeightOffset(g2Var.getTranslationY() - f12);
        h2Var.n(false, false);
        p2Var.C();
    }
}
