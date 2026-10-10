package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f54490a;
    public final b f54491b;
    public final c0 f54492c;

    public a(b bVar, c0 c0Var, int i10) {
        this.f54490a = i10;
        this.f54491b = bVar;
        this.f54492c = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54490a) {
            case 0:
                this.f54491b.f54520f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54492c.invalidate();
                return;
            default:
                this.f54491b.f54520f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54492c.invalidate();
                return;
        }
    }
}
