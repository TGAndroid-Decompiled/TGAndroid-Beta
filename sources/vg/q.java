package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fg0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44595a;
    public final float f44596b;
    public final float f44597c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44595a = fArr;
        this.f44596b = f7;
        this.f44597c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44595a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        fg0 fg0Var = rVar.f44598a;
        fg0Var.f43195b.f43170i = AndroidUtilities.lerp(this.f44596b, this.f44597c, 1.0f);
        sg.a aVar = fg0Var.f43195b;
        float f7 = aVar.f43168f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f43168f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(fg0Var.f43195b.f43170i);
        fg0Var.h(750L);
    }
}
