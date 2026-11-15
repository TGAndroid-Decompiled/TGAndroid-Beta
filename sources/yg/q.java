package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f60685a;
    public final float f60686b;
    public final float f60687c;
    public final boolean d;
    public final r f60688e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f60688e = rVar;
        this.f60685a = fArr;
        this.f60686b = f10;
        this.f60687c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f60685a;
        fArr[0] = 1.0f;
        this.f60688e.f60689a.f58893b.f58864l = g0.T1(this.f60686b, this.f60687c, 1.0f);
        vg.f fVar = this.f60688e.f60689a.f58893b;
        float f10 = fVar.f58859f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f58859f = (f11 * i7) + f10;
        this.f60688e.f60689a.f58893b.b();
        r rVar = this.f60688e;
        rVar.a(rVar.f60689a.f58893b.f58864l);
        this.f60688e.f60689a.j(750L);
    }
}
