package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f61253a;
    public final float f61254b;
    public final float f61255c;
    public final boolean d;
    public final r f61256e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f61256e = rVar;
        this.f61253a = fArr;
        this.f61254b = f10;
        this.f61255c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f61253a;
        fArr[0] = 1.0f;
        this.f61256e.f61257a.f59463b.f59434l = g0.T1(this.f61254b, this.f61255c, 1.0f);
        vg.f fVar = this.f61256e.f61257a.f59463b;
        float f10 = fVar.f59429f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f59429f = (f11 * i7) + f10;
        this.f61256e.f61257a.f59463b.b();
        r rVar = this.f61256e;
        rVar.a(rVar.f61257a.f59463b.f59434l);
        this.f61256e.f61257a.j(750L);
    }
}
