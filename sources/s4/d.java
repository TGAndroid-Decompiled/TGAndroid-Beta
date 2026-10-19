package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45941a;
    public final k f45942b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f45941a = i10;
        this.f45942b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45941a) {
            case 0:
                this.f45942b.Q();
                return;
            default:
                this.f45942b.M();
                return;
        }
    }
}
