package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.eo;
public final class f extends AnimatorListenerAdapter {
    public final s1 f46665a;
    public final float f46666b;
    public final float f46667c;
    public final float d;
    public final float e;
    public final n f46668f;

    public f(n nVar, s1 s1Var, float f10, float f11, float f12, float f13) {
        this.f46668f = nVar;
        this.f46665a = s1Var;
        this.f46666b = f10;
        this.f46667c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.f46665a;
        s1Var.getTransitionParams().j();
        s1Var.getPhotoImage().setImageCoords(this.f46666b, this.f46667c, this.d, this.e);
        eo eoVar = this.f46668f.P;
        if (eoVar != null) {
            eoVar.h.setAlpha(1.0f);
        }
        s1Var.invalidate();
    }
}
