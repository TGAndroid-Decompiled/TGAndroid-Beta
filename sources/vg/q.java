package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48329a;
    public final float f48330b;
    public final float f48331c;
    public final boolean d;
    public final r f48332e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f48332e = rVar;
        this.f48329a = fArr;
        this.f48330b = f7;
        this.f48331c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48329a;
        fArr[0] = 1.0f;
        r rVar = this.f48332e;
        cg0 cg0Var = rVar.f48333a;
        cg0Var.f46827b.f46802i = AndroidUtilities.lerp(this.f48330b, this.f48331c, 1.0f);
        sg.a aVar = cg0Var.f46827b;
        float f7 = aVar.f46800f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f46800f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(cg0Var.f46827b.f46802i);
        cg0Var.h(750L);
    }
}
