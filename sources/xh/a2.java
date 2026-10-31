package xh;

import android.animation.ValueAnimator;
public final class a2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f53684a;
    public final float f53685b;
    public final float f53686c;
    public final float d;
    public final float e;
    public final m2 f53687f;

    public a2(m2 m2Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f53687f = m2Var;
        this.f53684a = z10;
        this.f53685b = f7;
        this.f53686c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        m2 m2Var = this.f53687f;
        e2 e2Var = m2Var.D;
        j2 j2Var = m2Var.X;
        d2 d2Var = m2Var.f53904x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m2Var.f53885h0 = floatValue;
        if (!this.f53684a) {
            floatValue = 1.0f - floatValue;
        }
        m2Var.f53884g0 = floatValue;
        j2Var.setAlpha(1.0f - floatValue);
        j2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * m2Var.f53884g0);
        float f7 = this.f53685b;
        float f10 = m2Var.f53885h0;
        float f11 = this.f53686c;
        d2Var.setTranslationY(org.telegram.messenger.i0.T1(f7, f11, f10));
        d2Var.setTranslationX(org.telegram.messenger.i0.T1(this.d, 0.0f, m2Var.f53885h0));
        m2Var.m0.setTranslationX(org.telegram.messenger.i0.T1(this.e, 0.0f, m2Var.f53885h0));
        m2Var.f53891n0.setAlpha(m2Var.f53884g0);
        m2Var.f53882f.invalidate();
        e2Var.setViewPortHeightOffset(d2Var.getTranslationY() - f11);
        e2Var.n(false, false);
        m2Var.H();
    }
}
