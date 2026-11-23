package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f61298a;
    public final float f61299b;
    public final float f61300c;
    public final boolean d;
    public final r f61301e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f61301e = rVar;
        this.f61298a = fArr;
        this.f61299b = f10;
        this.f61300c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f61298a;
        fArr[0] = 1.0f;
        this.f61301e.f61302a.f59505b.f59476l = g0.T1(this.f61299b, this.f61300c, 1.0f);
        vg.f fVar = this.f61301e.f61302a.f59505b;
        float f10 = fVar.f59471f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f59471f = (f11 * i7) + f10;
        this.f61301e.f61302a.f59505b.b();
        r rVar = this.f61301e;
        rVar.a(rVar.f61302a.f59505b.f59476l);
        this.f61301e.f61302a.j(750L);
    }
}
