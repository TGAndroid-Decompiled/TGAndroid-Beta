package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48991a;
    public final float f48992b;
    public final float f48993c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f48991a = fArr;
        this.f48992b = f7;
        this.f48993c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48991a;
        fArr[0] = 1.0f;
        this.e.f48994a.f47108b.f47079l = AndroidUtilities.lerp(this.f48992b, this.f48993c, 1.0f);
        tg.g gVar = this.e.f48994a.f47108b;
        float f7 = gVar.f47074f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47074f = (f10 * i10) + f7;
        this.e.f48994a.f47108b.b();
        r rVar = this.e;
        rVar.a(rVar.f48994a.f47108b.f47079l);
        this.e.f48994a.j(750L);
    }
}
