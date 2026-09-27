package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44669a;
    public final float f44670b;
    public final float f44671c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44669a = fArr;
        this.f44670b = f7;
        this.f44671c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44669a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        bg0 bg0Var = rVar.f44672a;
        bg0Var.f43270b.f43245i = AndroidUtilities.lerp(this.f44670b, this.f44671c, 1.0f);
        sg.a aVar = bg0Var.f43270b;
        float f7 = aVar.f43243f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f43243f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(bg0Var.f43270b.f43245i);
        bg0Var.h(750L);
    }
}
