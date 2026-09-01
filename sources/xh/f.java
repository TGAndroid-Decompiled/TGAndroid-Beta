package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ho;
public final class f extends AnimatorListenerAdapter {
    public final t1 f50614a;
    public final float f50615b;
    public final float f50616c;
    public final float d;
    public final float f50617e;
    public final n f50618f;

    public f(n nVar, t1 t1Var, float f10, float f11, float f12, float f13) {
        this.f50618f = nVar;
        this.f50614a = t1Var;
        this.f50615b = f10;
        this.f50616c = f11;
        this.d = f12;
        this.f50617e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f50614a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f50615b, this.f50616c, this.d, this.f50617e);
        ho hoVar = this.f50618f.P;
        if (hoVar != null) {
            hoVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
