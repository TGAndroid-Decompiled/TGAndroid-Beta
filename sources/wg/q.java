package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f48573a;
    public final float f48574b;
    public final float f48575c;
    public final boolean d;
    public final r f48576e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.f48576e = rVar;
        this.f48573a = fArr;
        this.f48574b = f7;
        this.f48575c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f48573a;
        fArr[0] = 1.0f;
        r rVar = this.f48576e;
        eg0 eg0Var = rVar.f48577a;
        eg0Var.f46548b.f46523i = AndroidUtilities.lerp(this.f48574b, this.f48575c, 1.0f);
        tg.a aVar = eg0Var.f46548b;
        float f7 = aVar.f46521f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f46521f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(eg0Var.f46548b.f46523i);
        eg0Var.h(750L);
    }
}
