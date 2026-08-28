package qf;

import android.animation.ValueAnimator;
import kh.g4;
public final class h {
    public final int f46235a;
    public int f46236b;
    public float f46237c;
    public float d;
    public ValueAnimator f46238e;
    public float f46239f = 0.0f;
    public final j f46240g;

    public h(j jVar, int i9) {
        this.f46240g = jVar;
        this.f46235a = i9;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f46238e = ofFloat;
        ofFloat.setDuration(600L);
        this.f46238e.setInterpolator(g.f46192y1);
        this.f46238e.addUpdateListener(new g4(this, 15));
        this.f46238e.start();
    }
}
