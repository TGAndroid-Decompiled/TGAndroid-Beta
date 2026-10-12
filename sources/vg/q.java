package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q extends AnimatorListenerAdapter {
    public final float[] f49847a;
    public final float f49848b;
    public final float f49849c;
    public final boolean d;
    public final r f49850e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f49850e = rVar;
        this.f49847a = fArr;
        this.f49848b = f7;
        this.f49849c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f49847a;
        fArr[0] = 1.0f;
        this.f49850e.f49851a.f48317b.f48288l = AndroidUtilities.lerp(this.f49848b, this.f49849c, 1.0f);
        sg.g gVar = this.f49850e.f49851a.f48317b;
        float f7 = gVar.f48283f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        gVar.f48283f = (f10 * i10) + f7;
        this.f49850e.f49851a.f48317b.b();
        r rVar = this.f49850e;
        rVar.a(rVar.f49851a.f48317b.f48288l);
        this.f49850e.f49851a.k(750L);
    }
}
