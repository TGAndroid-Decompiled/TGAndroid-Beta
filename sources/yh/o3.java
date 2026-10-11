package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class o3 extends AnimatorListenerAdapter {
    public final p3 f53049a;

    public o3(p3 p3Var) {
        this.f53049a = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var = this.f53049a;
        f0 f0Var = p3Var.f53100i0;
        p3Var.f53112s0 = p3Var.f53110r0;
        p3Var.d(p3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = p3Var.f53094e;
        int i10 = 2 - p3Var.f53110r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) p3Var.W.f6678f;
        p7.a1(p3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - p3Var.f53110r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) p3Var.f53088a0.f6678f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.s5 m10 = org.telegram.ui.Components.s5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f30636m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(f0Var);
        AndroidUtilities.runOnUIThread(f0Var, 2500L);
    }
}
