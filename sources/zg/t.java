package zg;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f53528a;
    public final z f53529b;

    public t(z zVar, int i10) {
        this.f53528a = i10;
        this.f53529b = zVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53528a) {
            case 0:
                z zVar = this.f53529b;
                zVar.getClass();
                zVar.f53550a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f53529b.f53550a.invalidate();
                return;
        }
    }
}
