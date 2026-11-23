package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.fo;
public final class e extends AnimatorListenerAdapter {
    public final r1 f55781a;
    public final float f55782b;
    public final float f55783c;
    public final float d;
    public final float f55784e;
    public final k f55785f;

    public e(k kVar, r1 r1Var, float f10, float f11, float f12, float f13) {
        this.f55785f = kVar;
        this.f55781a = r1Var;
        this.f55782b = f10;
        this.f55783c = f11;
        this.d = f12;
        this.f55784e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r1 r1Var = this.f55781a;
        r1Var.getTransitionParams().e();
        r1Var.getPhotoImage().z0(this.f55782b, this.f55783c, this.d, this.f55784e);
        fo foVar = this.f55785f.P;
        if (foVar != null) {
            foVar.h.setAlpha(1.0f);
        }
        r1Var.invalidate();
    }
}
