package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49732a;
    public final float f49733b;
    public final float f49734c;
    public final boolean d;
    public final r f49735e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f49735e = rVar;
        this.f49732a = fArr;
        this.f49733b = f7;
        this.f49734c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49732a;
        fArr[0] = 1.0f;
        this.f49735e.f49736a.f48202b.f48173l = AndroidUtilities.lerp(this.f49733b, this.f49734c, 1.0f);
        sg.g gVar = this.f49735e.f49736a.f48202b;
        float f7 = gVar.f48168f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f48168f = (f10 * i10) + f7;
        this.f49735e.f49736a.f48202b.b();
        r rVar = this.f49735e;
        rVar.a(rVar.f49736a.f48202b.f48173l);
        this.f49735e.f49736a.k(750L);
    }
}
