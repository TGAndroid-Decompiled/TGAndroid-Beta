package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class n3 extends AnimatorListenerAdapter {
    public final o3 f50861a;

    public n3(o3 o3Var) {
        this.f50861a = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o3 o3Var = this.f50861a;
        zf.c cVar = o3Var.f50919i0;
        o3Var.f50931s0 = o3Var.f50929r0;
        o3Var.d(o3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = o3Var.e;
        int i10 = 2 - o3Var.f50929r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) o3Var.W.f5033f;
        p7.a1(o3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - o3Var.f50929r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) o3Var.f50908a0.f5033f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.s5 m10 = org.telegram.ui.Components.s5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f28741m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(cVar);
        AndroidUtilities.runOnUIThread(cVar, 2500L);
    }
}
