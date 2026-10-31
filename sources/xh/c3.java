package xh;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f53720a;
    public final i3 f53721b;

    public c3(i3 i3Var, int i10) {
        this.f53720a = i10;
        this.f53721b = i3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53720a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e2 e2Var = this.f53721b.f53809n;
                if (e2Var.getWebView() != null) {
                    e2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f53721b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
