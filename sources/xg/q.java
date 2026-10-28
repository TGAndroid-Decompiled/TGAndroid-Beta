package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f51857a;
    public final float f51858b;
    public final float f51859c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f51857a = fArr;
        this.f51858b = f7;
        this.f51859c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f51857a;
        fArr[0] = 1.0f;
        this.e.f51860a.f49851b.f49822l = AndroidUtilities.lerp(this.f51858b, this.f51859c, 1.0f);
        ug.g gVar = this.e.f51860a.f49851b;
        float f7 = gVar.f49817f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f49817f = (f10 * i10) + f7;
        this.e.f51860a.f49851b.b();
        r rVar = this.e;
        rVar.a(rVar.f51860a.f49851b.f49822l);
        this.e.f51860a.j(750L);
    }
}
