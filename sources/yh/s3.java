package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 extends AnimatorListenerAdapter {
    public final u3 f48008a;

    public s3(u3 u3Var) {
        this.f48008a = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u3 u3Var = this.f48008a;
        r2 r2Var = u3Var.f48093i0;
        u3Var.f48105s0 = u3Var.f48103r0;
        u3Var.d(u3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = u3Var.e;
        int i10 = 2 - u3Var.f48103r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) u3Var.W.f6150f;
        w7.Z0(u3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - u3Var.f48103r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u3Var.f48082a0.f6150f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f27507m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(r2Var);
        AndroidUtilities.runOnUIThread(r2Var, 2500L);
    }
}
