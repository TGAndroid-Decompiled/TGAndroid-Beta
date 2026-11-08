package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f59473a;
    public final float f59474b;
    public final float f59475c;
    public final boolean d;
    public final r f59476e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z9) {
        this.f59476e = rVar;
        this.f59473a = fArr;
        this.f59474b = f10;
        this.f59475c = f11;
        this.d = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f59473a;
        fArr[0] = 1.0f;
        this.f59476e.f59477a.f57411b.f57382l = g0.T1(this.f59474b, this.f59475c, 1.0f);
        vg.f fVar = this.f59476e.f59477a.f57411b;
        float f10 = fVar.f57377f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f57377f = (f11 * i7) + f10;
        this.f59476e.f59477a.f57411b.b();
        r rVar = this.f59476e;
        rVar.a(rVar.f59477a.f57411b.f57382l);
        this.f59476e.f59477a.j(750L);
    }
}
