package zg;

import android.animation.ValueAnimator;
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final int f49069a;
    public final q f49070b;

    public i(q qVar, int i10) {
        this.f49069a = i10;
        this.f49070b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49069a) {
            case 0:
                q qVar = this.f49070b;
                qVar.f49164w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49159c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49070b;
                qVar2.f49164w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49159c.getMeasuredHeight());
                return;
        }
    }
}
