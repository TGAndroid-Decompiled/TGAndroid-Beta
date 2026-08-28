package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.yn;
public final class e extends AnimatorListenerAdapter {
    public final t1 f47224a;
    public final float f47225b;
    public final float f47226c;
    public final float d;
    public final float f47227e;
    public final m f47228f;

    public e(m mVar, t1 t1Var, float f10, float f11, float f12, float f13) {
        this.f47228f = mVar;
        this.f47224a = t1Var;
        this.f47225b = f10;
        this.f47226c = f11;
        this.d = f12;
        this.f47227e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f47224a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f47225b, this.f47226c, this.d, this.f47227e);
        yn ynVar = this.f47228f.P;
        if (ynVar != null) {
            ynVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
