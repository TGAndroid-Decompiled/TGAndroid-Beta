package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.xn;
public final class e extends AnimatorListenerAdapter {
    public final q1 f55082a;
    public final float f55083b;
    public final float f55084c;
    public final float d;
    public final float f55085e;
    public final k f55086f;

    public e(k kVar, q1 q1Var, float f10, float f11, float f12, float f13) {
        this.f55086f = kVar;
        this.f55082a = q1Var;
        this.f55083b = f10;
        this.f55084c = f11;
        this.d = f12;
        this.f55085e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.f55082a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.f55083b, this.f55084c, this.d, this.f55085e);
        xn xnVar = this.f55086f.P;
        if (xnVar != null) {
            xnVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
