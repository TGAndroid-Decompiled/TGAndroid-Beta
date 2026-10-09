package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class o3 extends AnimatorListenerAdapter {
    public final p3 f52962a;

    public o3(p3 p3Var) {
        this.f52962a = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var = this.f52962a;
        f0 f0Var = p3Var.f53011i0;
        p3Var.f53023s0 = p3Var.f53021r0;
        p3Var.d(p3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = p3Var.f53005e;
        int i10 = 2 - p3Var.f53021r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) p3Var.W.f6679f;
        p7.a1(p3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - p3Var.f53021r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) p3Var.f52999a0.f6679f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.s5 m10 = org.telegram.ui.Components.s5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f30656m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(f0Var);
        AndroidUtilities.runOnUIThread(f0Var, 2500L);
    }
}
