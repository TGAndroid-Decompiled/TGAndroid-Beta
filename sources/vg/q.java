package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44365a;
    public final float f44366b;
    public final float f44367c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44365a = fArr;
        this.f44366b = f7;
        this.f44367c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44365a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        gg0 gg0Var = rVar.f44368a;
        gg0Var.f42959b.f42934i = AndroidUtilities.lerp(this.f44366b, this.f44367c, 1.0f);
        sg.a aVar = gg0Var.f42959b;
        float f7 = aVar.f42932f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f42932f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(gg0Var.f42959b.f42934i);
        gg0Var.h(750L);
    }
}
