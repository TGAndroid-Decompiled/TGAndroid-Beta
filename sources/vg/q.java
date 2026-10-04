package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48314a;
    public final float f48315b;
    public final float f48316c;
    public final boolean d;
    public final r f48317e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f48317e = rVar;
        this.f48314a = fArr;
        this.f48315b = f7;
        this.f48316c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48314a;
        fArr[0] = 1.0f;
        r rVar = this.f48317e;
        cg0 cg0Var = rVar.f48318a;
        cg0Var.f46813b.f46788i = AndroidUtilities.lerp(this.f48315b, this.f48316c, 1.0f);
        sg.a aVar = cg0Var.f46813b;
        float f7 = aVar.f46786f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f46786f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(cg0Var.f46813b.f46788i);
        cg0Var.h(750L);
    }
}
