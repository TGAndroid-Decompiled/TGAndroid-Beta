package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48995a;
    public final float f48996b;
    public final float f48997c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f48995a = fArr;
        this.f48996b = f7;
        this.f48997c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48995a;
        fArr[0] = 1.0f;
        this.e.f48998a.f47112b.f47083l = AndroidUtilities.lerp(this.f48996b, this.f48997c, 1.0f);
        tg.g gVar = this.e.f48998a.f47112b;
        float f7 = gVar.f47078f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47078f = (f10 * i10) + f7;
        this.e.f48998a.f47112b.b();
        r rVar = this.e;
        rVar.a(rVar.f48998a.f47112b.f47083l);
        this.e.f48998a.j(750L);
    }
}
