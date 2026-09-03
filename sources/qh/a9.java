package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import org.telegram.ui.Components.wo;
public final class a9 extends AnimatorListenerAdapter {
    public final int f44999a;
    public final ba f45000b;

    public a9(ba baVar, int i10) {
        this.f44999a = i10;
        this.f45000b = baVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44999a) {
            case 0:
                ba baVar = this.f45000b;
                baVar.f45064g2 = null;
                baVar.f45094r.setTranslationY(0.0f);
                baVar.f45094r.b(0.0f);
                return;
            case 1:
                ba baVar2 = this.f45000b;
                baVar2.f45081n.removeView(baVar2.J0);
                baVar2.J0 = null;
                baVar2.f45076k2 = null;
                baVar2.f45080m2 = null;
                h3 h3Var = baVar2.Z0.I;
                boolean z4 = true;
                if (baVar2.f45048c0 == 1) {
                    z4 = false;
                }
                h3Var.b(z4);
                return;
            default:
                ba baVar3 = this.f45000b;
                wo woVar = baVar3.f45125z2;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) baVar3.f45125z2.getParent()).removeView(baVar3.f45125z2);
                    }
                    baVar3.f45125z2 = null;
                }
                baVar3.B2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
