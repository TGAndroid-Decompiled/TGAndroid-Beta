package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f61382a;
    public final float f61383b;
    public final float f61384c;
    public final boolean d;
    public final r f61385e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f61385e = rVar;
        this.f61382a = fArr;
        this.f61383b = f10;
        this.f61384c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f61382a;
        fArr[0] = 1.0f;
        this.f61385e.f61386a.f59590b.f59561l = g0.T1(this.f61383b, this.f61384c, 1.0f);
        vg.f fVar = this.f61385e.f61386a.f59590b;
        float f10 = fVar.f59556f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f59556f = (f11 * i7) + f10;
        this.f61385e.f61386a.f59590b.b();
        r rVar = this.f61385e;
        rVar.a(rVar.f61386a.f59590b.f59561l);
        this.f61385e.f61386a.j(750L);
    }
}
