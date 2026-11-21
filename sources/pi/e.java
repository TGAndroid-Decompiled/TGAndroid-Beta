package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.io;
public final class e extends AnimatorListenerAdapter {
    public final r1 f55699a;
    public final float f55700b;
    public final float f55701c;
    public final float d;
    public final float f55702e;
    public final k f55703f;

    public e(k kVar, r1 r1Var, float f10, float f11, float f12, float f13) {
        this.f55703f = kVar;
        this.f55699a = r1Var;
        this.f55700b = f10;
        this.f55701c = f11;
        this.d = f12;
        this.f55702e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r1 r1Var = this.f55699a;
        r1Var.getTransitionParams().e();
        r1Var.getPhotoImage().y0(this.f55700b, this.f55701c, this.d, this.f55702e);
        io ioVar = this.f55703f.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        r1Var.invalidate();
    }
}
