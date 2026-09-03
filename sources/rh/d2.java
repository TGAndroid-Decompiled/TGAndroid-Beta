package rh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f43553a;
    public final float f43554b;
    public final float f43555c;
    public final float d;
    public final float e;
    public final p2 f43556f;

    public d2(p2 p2Var, boolean z4, float f10, float f11, float f12, float f13) {
        this.f43556f = p2Var;
        this.f43553a = z4;
        this.f43554b = f10;
        this.f43555c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        p2 p2Var = this.f43556f;
        h2 h2Var = p2Var.f43760x;
        m2 m2Var = p2Var.T;
        g2 g2Var = p2Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p2Var.f43736d0 = floatValue;
        if (!this.f43553a) {
            floatValue = 1.0f - floatValue;
        }
        p2Var.f43735c0 = floatValue;
        m2Var.setAlpha(1.0f - floatValue);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * p2Var.f43735c0);
        float f10 = this.f43554b;
        float f11 = p2Var.f43736d0;
        float f12 = this.f43555c;
        g2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        g2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, p2Var.f43736d0));
        p2Var.f43742i0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, p2Var.f43736d0));
        p2Var.f43743j0.setAlpha(p2Var.f43735c0);
        p2Var.e.invalidate();
        h2Var.setViewPortHeightOffset(g2Var.getTranslationY() - f12);
        h2Var.o(false, false);
        p2Var.C();
    }
}
