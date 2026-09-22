package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class u3 extends AnimatorListenerAdapter {
    public final w3 f47797a;

    public u3(w3 w3Var) {
        this.f47797a = w3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w3 w3Var = this.f47797a;
        x2 x2Var = w3Var.f47882i0;
        w3Var.f47894s0 = w3Var.f47892r0;
        w3Var.d(w3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = w3Var.e;
        int i10 = 2 - w3Var.f47892r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) w3Var.W.f6164f;
        x7.Z0(w3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - w3Var.f47892r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) w3Var.f47871a0.f6164f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f26691m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(x2Var);
        AndroidUtilities.runOnUIThread(x2Var, 2500L);
    }
}
