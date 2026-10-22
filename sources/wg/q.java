package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48994a;
    public final float f48995b;
    public final float f48996c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f48994a = fArr;
        this.f48995b = f7;
        this.f48996c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48994a;
        fArr[0] = 1.0f;
        this.e.f48997a.f47111b.f47082l = AndroidUtilities.lerp(this.f48995b, this.f48996c, 1.0f);
        tg.g gVar = this.e.f48997a.f47111b;
        float f7 = gVar.f47077f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47077f = (f10 * i10) + f7;
        this.e.f48997a.f47111b.b();
        r rVar = this.e;
        rVar.a(rVar.f48997a.f47111b.f47082l);
        this.e.f48997a.j(750L);
    }
}
