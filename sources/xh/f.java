package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ho;
public final class f extends AnimatorListenerAdapter {
    public final t1 f50650a;
    public final float f50651b;
    public final float f50652c;
    public final float d;
    public final float f50653e;
    public final n f50654f;

    public f(n nVar, t1 t1Var, float f10, float f11, float f12, float f13) {
        this.f50654f = nVar;
        this.f50650a = t1Var;
        this.f50651b = f10;
        this.f50652c = f11;
        this.d = f12;
        this.f50653e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f50650a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f50651b, this.f50652c, this.d, this.f50653e);
        ho hoVar = this.f50654f.P;
        if (hoVar != null) {
            hoVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
