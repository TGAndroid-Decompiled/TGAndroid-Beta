package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class v3 extends AnimatorListenerAdapter {
    public final x3 f47919a;

    public v3(x3 x3Var) {
        this.f47919a = x3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        x3 x3Var = this.f47919a;
        y2 y2Var = x3Var.f48003i0;
        x3Var.f48015s0 = x3Var.f48013r0;
        x3Var.d(x3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = x3Var.e;
        int i10 = 2 - x3Var.f48013r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) x3Var.W.f6167f;
        y7.Z0(x3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - x3Var.f48013r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x3Var.f47992a0.f6167f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f26641m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(y2Var);
        AndroidUtilities.runOnUIThread(y2Var, 2500L);
    }
}
