package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.e20;
import org.telegram.tgnet.tl.TL_stars;
public final class x3 extends AnimatorListenerAdapter {
    public final y3 f47697a;

    public x3(y3 y3Var) {
        this.f47697a = y3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        y3 y3Var = this.f47697a;
        ph.x1 x1Var = y3Var.f47743l0;
        y3Var.f47755v0 = y3Var.f47754u0;
        y3Var.d(y3Var.f47729a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = y3Var.e;
        int i10 = 2 - y3Var.f47754u0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) y3Var.f47733c0.f4480f;
        h8.c1(y3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - y3Var.f47754u0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y3Var.f47734d0.f4480f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(e20.f15506s0, 7, stargiftattributepattern.document);
            l4.f26072m = true;
            l4.u();
        }
        org.telegram.messenger.i0.r(x1Var);
        org.telegram.messenger.i0.h3(x1Var, 2500L);
    }
}
