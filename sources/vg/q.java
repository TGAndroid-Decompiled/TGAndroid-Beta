package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49839a;
    public final float f49840b;
    public final float f49841c;
    public final boolean d;
    public final r f49842e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f49842e = rVar;
        this.f49839a = fArr;
        this.f49840b = f7;
        this.f49841c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49839a;
        fArr[0] = 1.0f;
        this.f49842e.f49843a.f48309b.f48280l = AndroidUtilities.lerp(this.f49840b, this.f49841c, 1.0f);
        sg.g gVar = this.f49842e.f49843a.f48309b;
        float f7 = gVar.f48275f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f48275f = (f10 * i10) + f7;
        this.f49842e.f49843a.f48309b.b();
        r rVar = this.f49842e;
        rVar.a(rVar.f49843a.f48309b.f48280l);
        this.f49842e.f49843a.k(750L);
    }
}
