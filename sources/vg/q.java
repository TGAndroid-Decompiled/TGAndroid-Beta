package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49698a;
    public final float f49699b;
    public final float f49700c;
    public final boolean d;
    public final r f49701e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f49701e = rVar;
        this.f49698a = fArr;
        this.f49699b = f7;
        this.f49700c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49698a;
        fArr[0] = 1.0f;
        this.f49701e.f49702a.f48168b.f48139l = AndroidUtilities.lerp(this.f49699b, this.f49700c, 1.0f);
        sg.g gVar = this.f49701e.f49702a.f48168b;
        float f7 = gVar.f48134f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f48134f = (f10 * i10) + f7;
        this.f49701e.f49702a.f48168b.b();
        r rVar = this.f49701e;
        rVar.a(rVar.f49702a.f48168b.f48139l);
        this.f49701e.f49702a.k(750L);
    }
}
