package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import org.telegram.ui.Components.uo;
public final class d9 extends AnimatorListenerAdapter {
    public final int f41470a;
    public final da f41471b;

    public d9(da daVar, int i10) {
        this.f41470a = i10;
        this.f41471b = daVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41470a) {
            case 0:
                da daVar = this.f41471b;
                daVar.f41495g2 = null;
                daVar.f41525r.setTranslationY(0.0f);
                daVar.f41525r.b(0.0f);
                return;
            case 1:
                da daVar2 = this.f41471b;
                daVar2.f41512n.removeView(daVar2.J0);
                daVar2.J0 = null;
                daVar2.f41507k2 = null;
                daVar2.f41511m2 = null;
                i3 i3Var = daVar2.Z0.I;
                boolean z4 = true;
                if (daVar2.f41480c0 == 1) {
                    z4 = false;
                }
                i3Var.b(z4);
                return;
            default:
                da daVar3 = this.f41471b;
                uo uoVar = daVar3.f41556z2;
                if (uoVar != null) {
                    if (uoVar.getParent() != null) {
                        ((ViewGroup) daVar3.f41556z2.getParent()).removeView(daVar3.f41556z2);
                    }
                    daVar3.f41556z2 = null;
                }
                daVar3.B2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
