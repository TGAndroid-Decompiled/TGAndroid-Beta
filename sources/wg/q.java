package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f47599a;
    public final float f47600b;
    public final float f47601c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f47599a = fArr;
        this.f47600b = f7;
        this.f47601c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f47599a;
        fArr[0] = 1.0f;
        this.e.f47602a.f45740b.f45711l = AndroidUtilities.lerp(this.f47600b, this.f47601c, 1.0f);
        tg.g gVar = this.e.f47602a.f45740b;
        float f7 = gVar.f45706f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f45706f = (f10 * i10) + f7;
        this.e.f47602a.f45740b.b();
        r rVar = this.e;
        rVar.a(rVar.f47602a.f45740b.f45711l);
        this.e.f47602a.k(750L);
    }
}
