package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ho;
public final class f extends AnimatorListenerAdapter {
    public final t1 f50613a;
    public final float f50614b;
    public final float f50615c;
    public final float d;
    public final float f50616e;
    public final n f50617f;

    public f(n nVar, t1 t1Var, float f10, float f11, float f12, float f13) {
        this.f50617f = nVar;
        this.f50613a = t1Var;
        this.f50614b = f10;
        this.f50615c = f11;
        this.d = f12;
        this.f50616e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f50613a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f50614b, this.f50615c, this.d, this.f50616e);
        ho hoVar = this.f50617f.P;
        if (hoVar != null) {
            hoVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
