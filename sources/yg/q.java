package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f61252a;
    public final float f61253b;
    public final float f61254c;
    public final boolean d;
    public final r f61255e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f61255e = rVar;
        this.f61252a = fArr;
        this.f61253b = f10;
        this.f61254c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f61252a;
        fArr[0] = 1.0f;
        this.f61255e.f61256a.f59462b.f59433l = g0.T1(this.f61253b, this.f61254c, 1.0f);
        vg.f fVar = this.f61255e.f61256a.f59462b;
        float f10 = fVar.f59428f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f59428f = (f11 * i7) + f10;
        this.f61255e.f61256a.f59462b.b();
        r rVar = this.f61255e;
        rVar.a(rVar.f61256a.f59462b.f59433l);
        this.f61255e.f61256a.j(750L);
    }
}
