package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49436a;
    public final float f49437b;
    public final float f49438c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f49436a = fArr;
        this.f49437b = f7;
        this.f49438c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49436a;
        fArr[0] = 1.0f;
        this.e.f49439a.f47546b.f47517l = AndroidUtilities.lerp(this.f49437b, this.f49438c, 1.0f);
        tg.g gVar = this.e.f49439a.f47546b;
        float f7 = gVar.f47512f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47512f = (f10 * i10) + f7;
        this.e.f49439a.f47546b.b();
        r rVar = this.e;
        rVar.a(rVar.f49439a.f47546b.f47517l);
        this.e.f49439a.j(750L);
    }
}
