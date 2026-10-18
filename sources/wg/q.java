package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49032a;
    public final float f49033b;
    public final float f49034c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f49032a = fArr;
        this.f49033b = f7;
        this.f49034c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49032a;
        fArr[0] = 1.0f;
        this.e.f49035a.f47149b.f47120l = AndroidUtilities.lerp(this.f49033b, this.f49034c, 1.0f);
        tg.g gVar = this.e.f49035a.f47149b;
        float f7 = gVar.f47115f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47115f = (f10 * i10) + f7;
        this.e.f49035a.f47149b.b();
        r rVar = this.e;
        rVar.a(rVar.f49035a.f47149b.f47120l);
        this.e.f49035a.l(750L);
    }
}
