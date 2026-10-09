package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49611a;
    public final float f49612b;
    public final float f49613c;
    public final boolean d;
    public final r f49614e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f49614e = rVar;
        this.f49611a = fArr;
        this.f49612b = f7;
        this.f49613c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49611a;
        fArr[0] = 1.0f;
        this.f49614e.f49615a.f48078b.f48049l = AndroidUtilities.lerp(this.f49612b, this.f49613c, 1.0f);
        sg.g gVar = this.f49614e.f49615a.f48078b;
        float f7 = gVar.f48044f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f48044f = (f10 * i10) + f7;
        this.f49614e.f49615a.f48078b.b();
        r rVar = this.f49614e;
        rVar.a(rVar.f49615a.f48078b.f48049l);
        this.f49614e.f49615a.k(750L);
    }
}
