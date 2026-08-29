package ph;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45818a;
    public final n3 f45819b;

    public g3(n3 n3Var, int i10) {
        this.f45818a = i10;
        this.f45819b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45818a) {
            case 0:
                this.f45819b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var = this.f45819b.f45917n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
