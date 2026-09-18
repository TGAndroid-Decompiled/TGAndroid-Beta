package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class t3 extends AnimatorListenerAdapter {
    public final v3 f48038a;

    public t3(v3 v3Var) {
        this.f48038a = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v3 v3Var = this.f48038a;
        w2 w2Var = v3Var.f48121i0;
        v3Var.f48133s0 = v3Var.f48131r0;
        v3Var.d(v3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = v3Var.e;
        int i10 = 2 - v3Var.f48131r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) v3Var.W.f6167f;
        v7.Z0(v3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - v3Var.f48131r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v3Var.f48110a0.f6167f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f27463m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        AndroidUtilities.runOnUIThread(w2Var, 2500L);
    }
}
