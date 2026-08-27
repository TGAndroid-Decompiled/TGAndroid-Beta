package rf;

import android.animation.ValueAnimator;
import lh.m2;

public final class h {

    public final int f46994a;

    public int f46995b;

    public float f46996c;
    public float d;

    public ValueAnimator f46997e;

    public float f46998f = 0.0f;

    public final j f46999g;

    public h(j jVar, int i10) {
        this.f46999g = jVar;
        this.f46994a = i10;
    }

    public final void a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f46997e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(600L);
        this.f46997e.setInterpolator(g.f46951y1);
        this.f46997e.addUpdateListener(new m2(this, 19));
        this.f46997e.start();
    }
}
