package ph;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f45763a;
    public final float f45764b;
    public final float f45765c;
    public final float d;
    public final float f45766e;
    public final p2 f45767f;

    public d2(p2 p2Var, boolean z10, float f9, float f10, float f11, float f12) {
        this.f45767f = p2Var;
        this.f45763a = z10;
        this.f45764b = f9;
        this.f45765c = f10;
        this.d = f11;
        this.f45766e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        p2 p2Var = this.f45767f;
        h2 h2Var = p2Var.f45987x;
        m2 m2Var = p2Var.S;
        g2 g2Var = p2Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p2Var.f45961c0 = floatValue;
        if (!this.f45763a) {
            floatValue = 1.0f - floatValue;
        }
        p2Var.f45959b0 = floatValue;
        m2Var.setAlpha(1.0f - floatValue);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * p2Var.f45959b0);
        float f9 = this.f45764b;
        float f10 = p2Var.f45961c0;
        float f11 = this.f45765c;
        g2Var.setTranslationY(AndroidUtilities.lerp(f9, f11, f10));
        g2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, p2Var.f45961c0));
        p2Var.f45968h0.setTranslationX(AndroidUtilities.lerp(this.f45766e, 0.0f, p2Var.f45961c0));
        p2Var.f45969i0.setAlpha(p2Var.f45959b0);
        p2Var.f45963e.invalidate();
        h2Var.setViewPortHeightOffset(g2Var.getTranslationY() - f11);
        h2Var.n(false, false);
        p2Var.C();
    }
}
