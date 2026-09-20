package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class t3 extends AnimatorListenerAdapter {
    public final v3 f48065a;

    public t3(v3 v3Var) {
        this.f48065a = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v3 v3Var = this.f48065a;
        s2 s2Var = v3Var.f48163i0;
        v3Var.f48175s0 = v3Var.f48173r0;
        v3Var.d(v3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = v3Var.e;
        int i10 = 2 - v3Var.f48173r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) v3Var.W.f6168f;
        w7.Z0(v3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - v3Var.f48173r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v3Var.f48152a0.f6168f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f27164m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(s2Var);
        AndroidUtilities.runOnUIThread(s2Var, 2500L);
    }
}
