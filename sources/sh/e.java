package sh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.wn;

public final class e extends AnimatorListenerAdapter {

    public final s1 f47945a;

    public final float f47946b;

    public final float f47947c;
    public final float d;

    public final float f47948e;

    public final m f47949f;

    public e(m mVar, s1 s1Var, float f10, float f11, float f12, float f13) {
        this.f47949f = mVar;
        this.f47945a = s1Var;
        this.f47946b = f10;
        this.f47947c = f11;
        this.d = f12;
        this.f47948e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.f47945a;
        s1Var.getTransitionParams().j();
        s1Var.getPhotoImage().setImageCoords(this.f47946b, this.f47947c, this.d, this.f47948e);
        wn wnVar = this.f47949f.P;
        if (wnVar != null) {
            wnVar.h.setAlpha(1.0f);
        }
        s1Var.invalidate();
    }
}
