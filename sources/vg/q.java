package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44338a;
    public final float f44339b;
    public final float f44340c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44338a = fArr;
        this.f44339b = f7;
        this.f44340c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44338a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        eg0 eg0Var = rVar.f44341a;
        eg0Var.f42933b.f42908i = AndroidUtilities.lerp(this.f44339b, this.f44340c, 1.0f);
        sg.a aVar = eg0Var.f42933b;
        float f7 = aVar.f42906f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f42906f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(eg0Var.f42933b.f42908i);
        eg0Var.h(750L);
    }
}
