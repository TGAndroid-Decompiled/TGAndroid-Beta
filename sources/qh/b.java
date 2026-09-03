package qh;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f45008a;
    public final d f45009b;

    public b(d dVar, int i10) {
        this.f45008a = i10;
        this.f45009b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45008a) {
            case 0:
                d dVar = this.f45009b;
                dVar.getClass();
                dVar.M = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f45009b;
                dVar2.getClass();
                dVar2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f45009b;
                dVar3.getClass();
                dVar3.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f45009b;
                dVar4.getClass();
                dVar4.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f45009b;
                dVar5.getClass();
                dVar5.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
