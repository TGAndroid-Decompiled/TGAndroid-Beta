package wf;

import android.animation.ValueAnimator;
import oh.f5;
public final class h {
    public final int f49585a;
    public int f49586b;
    public float f49587c;
    public float d;
    public ValueAnimator f49588e;
    public float f49589f = 0.0f;
    public final j f49590g;

    public h(j jVar, int i10) {
        this.f49590g = jVar;
        this.f49585a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f49588e = ofFloat;
        ofFloat.setDuration(600L);
        this.f49588e.setInterpolator(g.f49541z1);
        this.f49588e.addUpdateListener(new f5(this, 25));
        this.f49588e.start();
    }
}
