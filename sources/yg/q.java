package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f59481a;
    public final float f59482b;
    public final float f59483c;
    public final boolean d;
    public final r f59484e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z9) {
        this.f59484e = rVar;
        this.f59481a = fArr;
        this.f59482b = f10;
        this.f59483c = f11;
        this.d = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f59481a;
        fArr[0] = 1.0f;
        this.f59484e.f59485a.f57420b.f57391l = g0.T1(this.f59482b, this.f59483c, 1.0f);
        vg.f fVar = this.f59484e.f59485a.f57420b;
        float f10 = fVar.f57386f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f57386f = (f11 * i7) + f10;
        this.f59484e.f59485a.f57420b.b();
        r rVar = this.f59484e;
        rVar.a(rVar.f59485a.f57420b.f57391l);
        this.f59484e.f59485a.j(750L);
    }
}
