package rh;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43604a;
    public final n3 f43605b;

    public g3(n3 n3Var, int i10) {
        this.f43604a = i10;
        this.f43605b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43604a) {
            case 0:
                this.f43605b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var = this.f43605b.f43693n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
