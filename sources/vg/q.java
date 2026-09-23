package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zf0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44292a;
    public final float f44293b;
    public final float f44294c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44292a = fArr;
        this.f44293b = f7;
        this.f44294c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44292a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        zf0 zf0Var = rVar.f44295a;
        zf0Var.f42889b.f42864i = AndroidUtilities.lerp(this.f44293b, this.f44294c, 1.0f);
        sg.a aVar = zf0Var.f42889b;
        float f7 = aVar.f42862f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f42862f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(zf0Var.f42889b.f42864i);
        zf0Var.h(750L);
    }
}
