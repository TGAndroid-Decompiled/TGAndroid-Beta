package uh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.co;
public final class e extends AnimatorListenerAdapter {
    public final s1 f49261a;
    public final float f49262b;
    public final float f49263c;
    public final float d;
    public final float f49264e;
    public final m f49265f;

    public e(m mVar, s1 s1Var, float f9, float f10, float f11, float f12) {
        this.f49265f = mVar;
        this.f49261a = s1Var;
        this.f49262b = f9;
        this.f49263c = f10;
        this.d = f11;
        this.f49264e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.f49261a;
        s1Var.getTransitionParams().j();
        s1Var.getPhotoImage().setImageCoords(this.f49262b, this.f49263c, this.d, this.f49264e);
        co coVar = this.f49265f.P;
        if (coVar != null) {
            coVar.h.setAlpha(1.0f);
        }
        s1Var.invalidate();
    }
}
