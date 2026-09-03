package wf;

import android.animation.ValueAnimator;
import oh.f5;
public final class h {
    public final int f49621a;
    public int f49622b;
    public float f49623c;
    public float d;
    public ValueAnimator f49624e;
    public float f49625f = 0.0f;
    public final j f49626g;

    public h(j jVar, int i10) {
        this.f49626g = jVar;
        this.f49621a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f49624e = ofFloat;
        ofFloat.setDuration(600L);
        this.f49624e.setInterpolator(g.f49577z1);
        this.f49624e.addUpdateListener(new f5(this, 25));
        this.f49624e.start();
    }
}
