package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f59375a;
    public final float f59376b;
    public final float f59377c;
    public final boolean d;
    public final r f59378e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z9) {
        this.f59378e = rVar;
        this.f59375a = fArr;
        this.f59376b = f10;
        this.f59377c = f11;
        this.d = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f59375a;
        fArr[0] = 1.0f;
        this.f59378e.f59379a.f57319b.f57290l = g0.T1(this.f59376b, this.f59377c, 1.0f);
        vg.f fVar = this.f59378e.f59379a.f57319b;
        float f10 = fVar.f57285f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f57285f = (f11 * i7) + f10;
        this.f59378e.f59379a.f57319b.b();
        r rVar = this.f59378e;
        rVar.a(rVar.f59379a.f57319b.f57290l);
        this.f59378e.f59379a.j(750L);
    }
}
