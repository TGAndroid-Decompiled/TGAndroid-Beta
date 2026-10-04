package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48313a;
    public final float f48314b;
    public final float f48315c;
    public final boolean d;
    public final r f48316e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f48316e = rVar;
        this.f48313a = fArr;
        this.f48314b = f7;
        this.f48315c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48313a;
        fArr[0] = 1.0f;
        r rVar = this.f48316e;
        cg0 cg0Var = rVar.f48317a;
        cg0Var.f46812b.f46787i = AndroidUtilities.lerp(this.f48314b, this.f48315c, 1.0f);
        sg.a aVar = cg0Var.f46812b;
        float f7 = aVar.f46785f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f46785f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(cg0Var.f46812b.f46787i);
        cg0Var.h(750L);
    }
}
