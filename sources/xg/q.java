package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f51799a;
    public final float f51800b;
    public final float f51801c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f51799a = fArr;
        this.f51800b = f7;
        this.f51801c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f51799a;
        fArr[0] = 1.0f;
        this.e.f51802a.f49816b.f49787l = AndroidUtilities.lerp(this.f51800b, this.f51801c, 1.0f);
        ug.g gVar = this.e.f51802a.f49816b;
        float f7 = gVar.f49782f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f49782f = (f10 * i10) + f7;
        this.e.f51802a.f49816b.b();
        r rVar = this.e;
        rVar.a(rVar.f51802a.f49816b.f49787l);
        this.e.f51802a.j(750L);
    }
}
