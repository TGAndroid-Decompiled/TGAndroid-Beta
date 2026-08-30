package rh;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43552a;
    public final o3 f43553b;

    public h3(o3 o3Var, int i10) {
        this.f43552a = i10;
        this.f43553b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43552a) {
            case 0:
                this.f43553b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var = this.f43553b.f43641n;
                if (j3Var.getWebView() != null) {
                    j3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
