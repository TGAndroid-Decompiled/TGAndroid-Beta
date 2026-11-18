package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.go;
public final class e extends AnimatorListenerAdapter {
    public final q1 f55658a;
    public final float f55659b;
    public final float f55660c;
    public final float d;
    public final float f55661e;
    public final k f55662f;

    public e(k kVar, q1 q1Var, float f10, float f11, float f12, float f13) {
        this.f55662f = kVar;
        this.f55658a = q1Var;
        this.f55659b = f10;
        this.f55660c = f11;
        this.d = f12;
        this.f55661e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.f55658a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.f55659b, this.f55660c, this.d, this.f55661e);
        go goVar = this.f55662f.P;
        if (goVar != null) {
            goVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
