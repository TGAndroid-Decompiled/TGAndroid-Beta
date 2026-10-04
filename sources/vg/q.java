package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48322a;
    public final float f48323b;
    public final float f48324c;
    public final boolean d;
    public final r f48325e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f48325e = rVar;
        this.f48322a = fArr;
        this.f48323b = f7;
        this.f48324c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48322a;
        fArr[0] = 1.0f;
        r rVar = this.f48325e;
        cg0 cg0Var = rVar.f48326a;
        cg0Var.f46820b.f46795i = AndroidUtilities.lerp(this.f48323b, this.f48324c, 1.0f);
        sg.a aVar = cg0Var.f46820b;
        float f7 = aVar.f46793f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f46793f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(cg0Var.f46820b.f46795i);
        cg0Var.h(750L);
    }
}
