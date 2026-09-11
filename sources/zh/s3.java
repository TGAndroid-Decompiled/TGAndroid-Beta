package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 extends AnimatorListenerAdapter {
    public final t3 f52562a;

    public s3(t3 t3Var) {
        this.f52562a = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t3 t3Var = this.f52562a;
        m2 m2Var = t3Var.f52628i0;
        t3Var.f52640s0 = t3Var.f52638r0;
        t3Var.d(t3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = t3Var.f52622e;
        int i10 = 2 - t3Var.f52638r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) t3Var.W.f5100f;
        v7.Z0(t3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - t3Var.f52638r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t3Var.f52616a0.f5100f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f29586m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(m2Var);
        AndroidUtilities.runOnUIThread(m2Var, 2500L);
    }
}
