package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 extends AnimatorListenerAdapter {
    public final u3 f51965a;

    public s3(u3 u3Var) {
        this.f51965a = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u3 u3Var = this.f51965a;
        n2 n2Var = u3Var.f52070i0;
        u3Var.f52082s0 = u3Var.f52080r0;
        u3Var.d(u3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = u3Var.f52064e;
        int i10 = 2 - u3Var.f52080r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) u3Var.W.f6627f;
        x7.f1(u3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - u3Var.f52080r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u3Var.f52058a0.f6627f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f29916m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(n2Var);
        AndroidUtilities.runOnUIThread(n2Var, 2500L);
    }
}
