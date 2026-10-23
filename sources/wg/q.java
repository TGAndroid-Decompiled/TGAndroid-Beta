package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49437a;
    public final float f49438b;
    public final float f49439c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f49437a = fArr;
        this.f49438b = f7;
        this.f49439c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49437a;
        fArr[0] = 1.0f;
        this.e.f49440a.f47547b.f47518l = AndroidUtilities.lerp(this.f49438b, this.f49439c, 1.0f);
        tg.g gVar = this.e.f49440a.f47547b;
        float f7 = gVar.f47513f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47513f = (f10 * i10) + f7;
        this.e.f49440a.f47547b.b();
        r rVar = this.e;
        rVar.a(rVar.f49440a.f47547b.f47518l);
        this.e.f49440a.j(750L);
    }
}
