package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.fo;
public final class f extends AnimatorListenerAdapter {
    public final t1 f46596a;
    public final float f46597b;
    public final float f46598c;
    public final float d;
    public final float e;
    public final n f46599f;

    public f(n nVar, t1 t1Var, float f10, float f11, float f12, float f13) {
        this.f46599f = nVar;
        this.f46596a = t1Var;
        this.f46597b = f10;
        this.f46598c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f46596a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f46597b, this.f46598c, this.d, this.e);
        fo foVar = this.f46599f.P;
        if (foVar != null) {
            foVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
