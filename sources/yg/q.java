package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f59483a;
    public final float f59484b;
    public final float f59485c;
    public final boolean d;
    public final r f59486e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z9) {
        this.f59486e = rVar;
        this.f59483a = fArr;
        this.f59484b = f10;
        this.f59485c = f11;
        this.d = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f59483a;
        fArr[0] = 1.0f;
        this.f59486e.f59487a.f57424b.f57395l = g0.T1(this.f59484b, this.f59485c, 1.0f);
        vg.f fVar = this.f59486e.f59487a.f57424b;
        float f10 = fVar.f57390f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f57390f = (f11 * i7) + f10;
        this.f59486e.f59487a.f57424b.b();
        r rVar = this.f59486e;
        rVar.a(rVar.f59487a.f57424b.f57395l);
        this.f59486e.f59487a.j(750L);
    }
}
