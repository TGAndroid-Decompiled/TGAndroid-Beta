package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49007a;
    public final float f49008b;
    public final float f49009c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f49007a = fArr;
        this.f49008b = f7;
        this.f49009c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49007a;
        fArr[0] = 1.0f;
        this.e.f49010a.f47127b.f47098l = AndroidUtilities.lerp(this.f49008b, this.f49009c, 1.0f);
        tg.g gVar = this.e.f49010a.f47127b;
        float f7 = gVar.f47093f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f47093f = (f10 * i10) + f7;
        this.e.f49010a.f47127b.b();
        r rVar = this.e;
        rVar.a(rVar.f49010a.f47127b.f47098l);
        this.e.f49010a.k(750L);
    }
}
