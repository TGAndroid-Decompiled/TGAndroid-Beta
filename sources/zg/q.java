package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f60514a;
    public final float f60515b;
    public final float f60516c;
    public final boolean d;
    public final r f60517e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f60517e = rVar;
        this.f60514a = fArr;
        this.f60515b = f10;
        this.f60516c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        float[] fArr = this.f60514a;
        fArr[0] = 1.0f;
        this.f60517e.f60518a.f57666b.f57637l = g0.T1(this.f60515b, this.f60516c, 1.0f);
        wg.f fVar = this.f60517e.f60518a.f57666b;
        float f10 = fVar.f57632f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        fVar.f57632f = (f11 * i3) + f10;
        this.f60517e.f60518a.f57666b.b();
        r rVar = this.f60517e;
        rVar.a(rVar.f60518a.f57666b.f57637l);
        this.f60517e.f60518a.j(750L);
    }
}
