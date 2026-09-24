package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49219a;
    public final b f49220b;
    public final d0 f49221c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f49219a = i10;
        this.f49220b = bVar;
        this.f49221c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49219a) {
            case 0:
                this.f49220b.f49233f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49221c.invalidate();
                return;
            default:
                this.f49220b.f49233f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49221c.invalidate();
                return;
        }
    }
}
