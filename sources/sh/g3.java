package sh;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47443a;
    public final n3 f47444b;

    public g3(n3 n3Var, int i10) {
        this.f47443a = i10;
        this.f47444b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47443a) {
            case 0:
                this.f47444b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var = this.f47444b.f47542n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
