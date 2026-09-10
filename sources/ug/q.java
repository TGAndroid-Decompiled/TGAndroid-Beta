package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f42710a;
    public final float f42711b;
    public final float f42712c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f42710a = fArr;
        this.f42711b = f7;
        this.f42712c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f42710a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        eg0 eg0Var = rVar.f42713a;
        eg0Var.f41485b.f41458i = AndroidUtilities.lerp(this.f42711b, this.f42712c, 1.0f);
        rg.a aVar = eg0Var.f41485b;
        float f7 = aVar.f41456f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f41456f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(eg0Var.f41485b.f41458i);
        eg0Var.h(750L);
    }
}
