package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f61294a;
    public final float f61295b;
    public final float f61296c;
    public final boolean d;
    public final r f61297e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f61297e = rVar;
        this.f61294a = fArr;
        this.f61295b = f10;
        this.f61296c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f61294a;
        fArr[0] = 1.0f;
        this.f61297e.f61298a.f59501b.f59472l = g0.T1(this.f61295b, this.f61296c, 1.0f);
        vg.f fVar = this.f61297e.f61298a.f59501b;
        float f10 = fVar.f59467f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f59467f = (f11 * i7) + f10;
        this.f61297e.f61298a.f59501b.b();
        r rVar = this.f61297e;
        rVar.a(rVar.f61298a.f59501b.f59472l);
        this.f61297e.f61298a.j(750L);
    }
}
