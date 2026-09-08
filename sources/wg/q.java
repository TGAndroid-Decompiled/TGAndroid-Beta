package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48572a;
    public final float f48573b;
    public final float f48574c;
    public final boolean d;
    public final r f48575e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f48575e = rVar;
        this.f48572a = fArr;
        this.f48573b = f7;
        this.f48574c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48572a;
        fArr[0] = 1.0f;
        r rVar = this.f48575e;
        eg0 eg0Var = rVar.f48576a;
        eg0Var.f46547b.f46522i = AndroidUtilities.lerp(this.f48573b, this.f48574c, 1.0f);
        tg.a aVar = eg0Var.f46547b;
        float f7 = aVar.f46520f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f46520f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(eg0Var.f46547b.f46522i);
        eg0Var.h(750L);
    }
}
