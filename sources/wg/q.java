package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48986a;
    public final float f48987b;
    public final float f48988c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f48986a = fArr;
        this.f48987b = f7;
        this.f48988c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48986a;
        fArr[0] = 1.0f;
        this.e.f48989a.f47103b.f47074l = AndroidUtilities.lerp(this.f48987b, this.f48988c, 1.0f);
        tg.g gVar = this.e.f48989a.f47103b;
        float f7 = gVar.f47069f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47069f = (f10 * i10) + f7;
        this.e.f48989a.f47103b.b();
        r rVar = this.e;
        rVar.a(rVar.f48989a.f47103b.f47074l);
        this.e.f48989a.j(750L);
    }
}
