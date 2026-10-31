package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b2 extends AnimatorListenerAdapter {
    public final boolean f53705a;
    public final float f53706b;
    public final float f53707c;
    public final m2 d;

    public b2(m2 m2Var, boolean z10, float f7, float f10) {
        this.d = m2Var;
        this.f53705a = z10;
        this.f53706b = f7;
        this.f53707c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m2 m2Var = this.d;
        e2 e2Var = m2Var.D;
        j2 j2Var = m2Var.X;
        d2 d2Var = m2Var.f53904x;
        m2Var.f53886i0 = false;
        boolean z10 = this.f53705a;
        if (!z10) {
            m2Var.I();
            m2Var.L();
            float f10 = this.f53706b;
            d2Var.setForceOffsetY(f10 - org.telegram.messenger.i0.L(24.0f));
            d2Var.setTopActionBarOffsetY(f10 - org.telegram.messenger.i0.L(24.0f));
            d2Var.setSwipeOffsetY(0.0f);
        } else {
            d2Var.setForceOffsetY(-org.telegram.messenger.i0.L(24.0f));
            d2Var.setTopActionBarOffsetY(-org.telegram.messenger.i0.L(24.0f));
            d2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = m2Var.f53885h0;
        } else {
            f7 = 1.0f - m2Var.f53885h0;
        }
        m2Var.f53884g0 = f7;
        j2Var.setAlpha(1.0f - f7);
        j2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * m2Var.f53884g0);
        m2Var.f53891n0.setAlpha(m2Var.f53884g0);
        if (z10) {
            j2Var.setVisibility(8);
        }
        d2Var.setSwipeOffsetAnimationDisallowed(false);
        d2Var.setTranslationX(org.telegram.messenger.i0.T1(this.f53707c, 0.0f, m2Var.f53885h0));
        m2Var.m0.setTranslationX(0.0f);
        m2Var.f53882f.invalidate();
        e2Var.setViewPortHeightOffset(0.0f);
        e2Var.n(true, true);
        m2Var.H();
    }
}
