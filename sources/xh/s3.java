package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 extends AnimatorListenerAdapter {
    public final u3 f46031a;

    public s3(u3 u3Var) {
        this.f46031a = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u3 u3Var = this.f46031a;
        x xVar = u3Var.f46109i0;
        u3Var.f46121s0 = u3Var.f46119r0;
        u3Var.d(u3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = u3Var.e;
        int i10 = 2 - u3Var.f46119r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) u3Var.W.f4941f;
        z7.Z0(u3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - u3Var.f46119r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u3Var.f46098a0.f4941f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f26035m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(xVar);
        AndroidUtilities.runOnUIThread(xVar, 2500L);
    }
}
