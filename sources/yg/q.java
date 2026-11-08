package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f59474a;
    public final float f59475b;
    public final float f59476c;
    public final boolean d;
    public final r f59477e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z9) {
        this.f59477e = rVar;
        this.f59474a = fArr;
        this.f59475b = f10;
        this.f59476c = f11;
        this.d = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f59474a;
        fArr[0] = 1.0f;
        this.f59477e.f59478a.f57412b.f57383l = g0.T1(this.f59475b, this.f59476c, 1.0f);
        vg.f fVar = this.f59477e.f59478a.f57412b;
        float f10 = fVar.f57378f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f57378f = (f11 * i7) + f10;
        this.f59477e.f59478a.f57412b.b();
        r rVar = this.f59477e;
        rVar.a(rVar.f59478a.f57412b.f57383l);
        this.f59477e.f59478a.j(750L);
    }
}
