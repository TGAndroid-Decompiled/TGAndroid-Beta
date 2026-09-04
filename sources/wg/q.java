package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48543a;
    public final float f48544b;
    public final float f48545c;
    public final boolean d;
    public final r f48546e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f48546e = rVar;
        this.f48543a = fArr;
        this.f48544b = f7;
        this.f48545c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48543a;
        fArr[0] = 1.0f;
        r rVar = this.f48546e;
        eg0 eg0Var = rVar.f48547a;
        eg0Var.f46519b.f46494i = AndroidUtilities.lerp(this.f48544b, this.f48545c, 1.0f);
        tg.a aVar = eg0Var.f46519b;
        float f7 = aVar.f46492f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f46492f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(eg0Var.f46519b.f46494i);
        eg0Var.h(750L);
    }
}
