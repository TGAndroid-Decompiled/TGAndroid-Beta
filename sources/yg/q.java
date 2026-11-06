package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f59376a;
    public final float f59377b;
    public final float f59378c;
    public final boolean d;
    public final r f59379e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z9) {
        this.f59379e = rVar;
        this.f59376a = fArr;
        this.f59377b = f10;
        this.f59378c = f11;
        this.d = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float[] fArr = this.f59376a;
        fArr[0] = 1.0f;
        this.f59379e.f59380a.f57320b.f57291l = g0.T1(this.f59377b, this.f59378c, 1.0f);
        vg.f fVar = this.f59379e.f59380a.f57320b;
        float f10 = fVar.f57286f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        fVar.f57286f = (f11 * i7) + f10;
        this.f59379e.f59380a.f57320b.b();
        r rVar = this.f59379e;
        rVar.a(rVar.f59380a.f57320b.f57291l);
        this.f59379e.f59380a.j(750L);
    }
}
