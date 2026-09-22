package zg;

import android.animation.ValueAnimator;
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final int f49361a;
    public final q f49362b;

    public i(q qVar, int i10) {
        this.f49361a = i10;
        this.f49362b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49361a) {
            case 0:
                q qVar = this.f49362b;
                qVar.f49456w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49451c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49362b;
                qVar2.f49456w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49451c.getMeasuredHeight());
                return;
        }
    }
}
