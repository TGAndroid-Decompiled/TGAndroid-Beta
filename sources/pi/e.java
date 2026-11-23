package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.io;
public final class e extends AnimatorListenerAdapter {
    public final r1 f55703a;
    public final float f55704b;
    public final float f55705c;
    public final float d;
    public final float f55706e;
    public final k f55707f;

    public e(k kVar, r1 r1Var, float f10, float f11, float f12, float f13) {
        this.f55707f = kVar;
        this.f55703a = r1Var;
        this.f55704b = f10;
        this.f55705c = f11;
        this.d = f12;
        this.f55706e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r1 r1Var = this.f55703a;
        r1Var.getTransitionParams().e();
        r1Var.getPhotoImage().y0(this.f55704b, this.f55705c, this.d, this.f55706e);
        io ioVar = this.f55707f.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        r1Var.invalidate();
    }
}
