package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44342a;
    public final float f44343b;
    public final float f44344c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44342a = fArr;
        this.f44343b = f7;
        this.f44344c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44342a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        eg0 eg0Var = rVar.f44345a;
        eg0Var.f42937b.f42912i = AndroidUtilities.lerp(this.f44343b, this.f44344c, 1.0f);
        sg.a aVar = eg0Var.f42937b;
        float f7 = aVar.f42910f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f42910f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(eg0Var.f42937b.f42912i);
        eg0Var.h(750L);
    }
}
