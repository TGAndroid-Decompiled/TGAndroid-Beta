package qg;

import android.animation.ValueAnimator;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f40863a;
    public final t f40864b;
    public final s f40865c;

    public q(t tVar, s sVar, int i10) {
        this.f40863a = i10;
        this.f40864b = tVar;
        this.f40865c = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40863a) {
            case 0:
                t tVar = this.f40864b;
                tVar.getClass();
                this.f40865c.f40897c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.invalidate();
                return;
            default:
                t tVar2 = this.f40864b;
                tVar2.getClass();
                this.f40865c.f40897c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar2.invalidate();
                return;
        }
    }
}
