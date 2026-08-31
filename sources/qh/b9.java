package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import org.telegram.ui.Components.wo;
public final class b9 extends AnimatorListenerAdapter {
    public final int f45022a;
    public final ca f45023b;

    public b9(ca caVar, int i10) {
        this.f45022a = i10;
        this.f45023b = caVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45022a) {
            case 0:
                ca caVar = this.f45023b;
                caVar.f45098g2 = null;
                caVar.f45128r.setTranslationY(0.0f);
                caVar.f45128r.b(0.0f);
                return;
            case 1:
                ca caVar2 = this.f45023b;
                caVar2.f45115n.removeView(caVar2.J0);
                caVar2.J0 = null;
                caVar2.f45110k2 = null;
                caVar2.f45114m2 = null;
                i3 i3Var = caVar2.Z0.I;
                boolean z4 = true;
                if (caVar2.f45082c0 == 1) {
                    z4 = false;
                }
                i3Var.b(z4);
                return;
            default:
                ca caVar3 = this.f45023b;
                wo woVar = caVar3.f45159z2;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) caVar3.f45159z2.getParent()).removeView(caVar3.f45159z2);
                    }
                    caVar3.f45159z2 = null;
                }
                caVar3.B2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
