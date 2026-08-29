package tf;

import android.animation.ValueAnimator;
import lh.d5;
public final class h {
    public final int f48294a;
    public int f48295b;
    public float f48296c;
    public float d;
    public ValueAnimator f48297e;
    public float f48298f = 0.0f;
    public final j f48299g;

    public h(j jVar, int i10) {
        this.f48299g = jVar;
        this.f48294a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f48297e = ofFloat;
        ofFloat.setDuration(600L);
        this.f48297e.setInterpolator(g.f48251y1);
        this.f48297e.addUpdateListener(new d5(this, 25));
        this.f48297e.start();
    }
}
