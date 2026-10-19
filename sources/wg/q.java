package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48984a;
    public final float f48985b;
    public final float f48986c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f48984a = fArr;
        this.f48985b = f7;
        this.f48986c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48984a;
        fArr[0] = 1.0f;
        this.e.f48987a.f47101b.f47072l = AndroidUtilities.lerp(this.f48985b, this.f48986c, 1.0f);
        tg.g gVar = this.e.f48987a.f47101b;
        float f7 = gVar.f47067f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47067f = (f10 * i10) + f7;
        this.e.f48987a.f47101b.b();
        r rVar = this.e;
        rVar.a(rVar.f48987a.f47101b.f47072l);
        this.e.f48987a.j(750L);
    }
}
