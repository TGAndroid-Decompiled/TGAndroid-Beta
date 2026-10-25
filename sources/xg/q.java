package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f51796a;
    public final float f51797b;
    public final float f51798c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f51796a = fArr;
        this.f51797b = f7;
        this.f51798c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f51796a;
        fArr[0] = 1.0f;
        this.e.f51799a.f49813b.f49784l = AndroidUtilities.lerp(this.f51797b, this.f51798c, 1.0f);
        ug.g gVar = this.e.f51799a.f49813b;
        float f7 = gVar.f49779f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f49779f = (f10 * i10) + f7;
        this.e.f51799a.f49813b.b();
        r rVar = this.e;
        rVar.a(rVar.f51799a.f49813b.f49784l);
        this.e.f51799a.j(750L);
    }
}
