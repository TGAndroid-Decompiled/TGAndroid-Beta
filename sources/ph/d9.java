package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import org.telegram.ui.Components.to;
public final class d9 extends AnimatorListenerAdapter {
    public final int f41508a;
    public final da f41509b;

    public d9(da daVar, int i10) {
        this.f41508a = i10;
        this.f41509b = daVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41508a) {
            case 0:
                da daVar = this.f41509b;
                daVar.f41533g2 = null;
                daVar.f41563r.setTranslationY(0.0f);
                daVar.f41563r.b(0.0f);
                return;
            case 1:
                da daVar2 = this.f41509b;
                daVar2.f41550n.removeView(daVar2.J0);
                daVar2.J0 = null;
                daVar2.f41545k2 = null;
                daVar2.f41549m2 = null;
                i3 i3Var = daVar2.Z0.I;
                boolean z4 = true;
                if (daVar2.f41518c0 == 1) {
                    z4 = false;
                }
                i3Var.b(z4);
                return;
            default:
                da daVar3 = this.f41509b;
                to toVar = daVar3.f41594z2;
                if (toVar != null) {
                    if (toVar.getParent() != null) {
                        ((ViewGroup) daVar3.f41594z2.getParent()).removeView(daVar3.f41594z2);
                    }
                    daVar3.f41594z2 = null;
                }
                daVar3.B2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
