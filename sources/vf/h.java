package vf;

import android.animation.ValueAnimator;
import nh.e5;
public final class h {
    public final int f45824a;
    public int f45825b;
    public float f45826c;
    public float d;
    public ValueAnimator e;
    public float f45827f = 0.0f;
    public final j f45828g;

    public h(j jVar, int i10) {
        this.f45828g = jVar;
        this.f45824a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(g.f45781z1);
        this.e.addUpdateListener(new e5(this, 25));
        this.e.start();
    }
}
