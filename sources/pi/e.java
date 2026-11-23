package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.io;
public final class e extends AnimatorListenerAdapter {
    public final r1 f55668a;
    public final float f55669b;
    public final float f55670c;
    public final float d;
    public final float f55671e;
    public final k f55672f;

    public e(k kVar, r1 r1Var, float f10, float f11, float f12, float f13) {
        this.f55672f = kVar;
        this.f55668a = r1Var;
        this.f55669b = f10;
        this.f55670c = f11;
        this.d = f12;
        this.f55671e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r1 r1Var = this.f55668a;
        r1Var.getTransitionParams().e();
        r1Var.getPhotoImage().y0(this.f55669b, this.f55670c, this.d, this.f55671e);
        io ioVar = this.f55672f.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        r1Var.invalidate();
    }
}
