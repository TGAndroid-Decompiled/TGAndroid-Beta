package wf;

import android.animation.ValueAnimator;
import oh.f5;
public final class h {
    public final int f49584a;
    public int f49585b;
    public float f49586c;
    public float d;
    public ValueAnimator f49587e;
    public float f49588f = 0.0f;
    public final j f49589g;

    public h(j jVar, int i10) {
        this.f49589g = jVar;
        this.f49584a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f49587e = ofFloat;
        ofFloat.setDuration(600L);
        this.f49587e.setInterpolator(g.f49540z1);
        this.f49587e.addUpdateListener(new f5(this, 25));
        this.f49587e.start();
    }
}
