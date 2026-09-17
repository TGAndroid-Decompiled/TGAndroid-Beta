package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48544a;
    public final float f48545b;
    public final float f48546c;
    public final boolean d;
    public final r f48547e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f48547e = rVar;
        this.f48544a = fArr;
        this.f48545b = f7;
        this.f48546c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48544a;
        fArr[0] = 1.0f;
        r rVar = this.f48547e;
        eg0 eg0Var = rVar.f48548a;
        eg0Var.f46520b.f46495i = AndroidUtilities.lerp(this.f48545b, this.f48546c, 1.0f);
        tg.a aVar = eg0Var.f46520b;
        float f7 = aVar.f46493f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f46493f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(eg0Var.f46520b.f46495i);
        eg0Var.h(750L);
    }
}
