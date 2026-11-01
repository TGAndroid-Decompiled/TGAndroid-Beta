package xh;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f53738a;
    public final j3 f53739b;

    public c3(j3 j3Var, int i10) {
        this.f53738a = i10;
        this.f53739b = j3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53738a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e2 e2Var = this.f53739b.f53846n;
                if (e2Var.getWebView() != null) {
                    e2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f53739b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
