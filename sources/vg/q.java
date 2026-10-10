package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49655a;
    public final float f49656b;
    public final float f49657c;
    public final boolean d;
    public final r f49658e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f49658e = rVar;
        this.f49655a = fArr;
        this.f49656b = f7;
        this.f49657c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49655a;
        fArr[0] = 1.0f;
        this.f49658e.f49659a.f48122b.f48093l = AndroidUtilities.lerp(this.f49656b, this.f49657c, 1.0f);
        sg.g gVar = this.f49658e.f49659a.f48122b;
        float f7 = gVar.f48088f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f48088f = (f10 * i10) + f7;
        this.f49658e.f49659a.f48122b.b();
        r rVar = this.f49658e;
        rVar.a(rVar.f49659a.f48122b.f48093l);
        this.f49658e.f49659a.k(750L);
    }
}
