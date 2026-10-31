package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.d20;
import org.telegram.tgnet.tl.TL_stars;
public final class x3 extends AnimatorListenerAdapter {
    public final y3 f47683a;

    public x3(y3 y3Var) {
        this.f47683a = y3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        y3 y3Var = this.f47683a;
        ph.x1 x1Var = y3Var.f47731l0;
        y3Var.f47743v0 = y3Var.f47742u0;
        y3Var.d(y3Var.f47717a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = y3Var.e;
        int i10 = 2 - y3Var.f47742u0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) y3Var.f47721c0.f4480f;
        h8.b1(y3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - y3Var.f47742u0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y3Var.f47722d0.f4480f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(d20.f15147s0, 7, stargiftattributepattern.document);
            l4.f25977m = true;
            l4.u();
        }
        org.telegram.messenger.i0.r(x1Var);
        org.telegram.messenger.i0.h3(x1Var, 2500L);
    }
}
