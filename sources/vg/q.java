package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49609a;
    public final float f49610b;
    public final float f49611c;
    public final boolean d;
    public final r f49612e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f49612e = rVar;
        this.f49609a = fArr;
        this.f49610b = f7;
        this.f49611c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49609a;
        fArr[0] = 1.0f;
        this.f49612e.f49613a.f48076b.f48047l = AndroidUtilities.lerp(this.f49610b, this.f49611c, 1.0f);
        sg.g gVar = this.f49612e.f49613a.f48076b;
        float f7 = gVar.f48042f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f48042f = (f10 * i10) + f7;
        this.f49612e.f49613a.f48076b.b();
        r rVar = this.f49612e;
        rVar.a(rVar.f49613a.f48076b.f48047l);
        this.f49612e.f49613a.k(750L);
    }
}
