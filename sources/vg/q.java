package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44639a;
    public final float f44640b;
    public final float f44641c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44639a = fArr;
        this.f44640b = f7;
        this.f44641c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44639a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        gg0 gg0Var = rVar.f44642a;
        gg0Var.f43239b.f43214i = AndroidUtilities.lerp(this.f44640b, this.f44641c, 1.0f);
        sg.a aVar = gg0Var.f43239b;
        float f7 = aVar.f43212f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f43212f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(gg0Var.f43239b.f43214i);
        gg0Var.h(750L);
    }
}
