package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class t3 extends AnimatorListenerAdapter {
    public final v3 f52017a;

    public t3(v3 v3Var) {
        this.f52017a = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v3 v3Var = this.f52017a;
        o2 o2Var = v3Var.f52140i0;
        v3Var.f52152s0 = v3Var.f52150r0;
        v3Var.d(v3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = v3Var.f52134e;
        int i10 = 2 - v3Var.f52150r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) v3Var.W.f6627f;
        z7.f1(v3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - v3Var.f52150r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v3Var.f52128a0.f6627f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f29937m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(o2Var);
        AndroidUtilities.runOnUIThread(o2Var, 2500L);
    }
}
