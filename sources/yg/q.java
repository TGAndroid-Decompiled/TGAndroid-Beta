package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f61263a;
    public final float f61264b;
    public final float f61265c;
    public final boolean d;
    public final r f61266e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f61266e = rVar;
        this.f61263a = fArr;
        this.f61264b = f10;
        this.f61265c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f61263a;
        fArr[0] = 1.0f;
        this.f61266e.f61267a.f59470b.f59441l = g0.T1(this.f61264b, this.f61265c, 1.0f);
        vg.g gVar = this.f61266e.f61267a.f59470b;
        float f10 = gVar.f59436f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        gVar.f59436f = (f11 * i7) + f10;
        this.f61266e.f61267a.f59470b.b();
        r rVar = this.f61266e;
        rVar.a(rVar.f61267a.f59470b.f59441l);
        this.f61266e.f61267a.j(750L);
    }
}
