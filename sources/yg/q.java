package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f59351a;
    public final float f59352b;
    public final float f59353c;
    public final boolean d;
    public final r f59354e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z9) {
        this.f59354e = rVar;
        this.f59351a = fArr;
        this.f59352b = f10;
        this.f59353c = f11;
        this.d = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f59351a;
        fArr[0] = 1.0f;
        this.f59354e.f59355a.f57295b.f57266l = g0.T1(this.f59352b, this.f59353c, 1.0f);
        vg.f fVar = this.f59354e.f59355a.f57295b;
        float f10 = fVar.f57261f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f57261f = (f11 * i7) + f10;
        this.f59354e.f59355a.f57295b.b();
        r rVar = this.f59354e;
        rVar.a(rVar.f59355a.f57295b.f57266l);
        this.f59354e.f59355a.j(750L);
    }
}
