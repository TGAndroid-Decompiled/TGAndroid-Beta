package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44370a;
    public final float f44371b;
    public final float f44372c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44370a = fArr;
        this.f44371b = f7;
        this.f44372c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44370a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        gg0 gg0Var = rVar.f44373a;
        gg0Var.f42964b.f42939i = AndroidUtilities.lerp(this.f44371b, this.f44372c, 1.0f);
        sg.a aVar = gg0Var.f42964b;
        float f7 = aVar.f42937f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f42937f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(gg0Var.f42964b.f42939i);
        gg0Var.h(750L);
    }
}
