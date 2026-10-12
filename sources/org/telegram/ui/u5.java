package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class u5 implements DialogInterface.OnDismissListener {
    public final int f42366a;
    public final Object f42367b;

    public u5(Object obj, int i10) {
        this.f42366a = i10;
        this.f42367b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.fk0 fk0Var;
        int i10 = this.f42366a;
        Object obj = this.f42367b;
        switch (i10) {
            case 0:
                ((v5) obj).f42674a.x0(false);
                return;
            case 1:
                ((t9) obj).f42126b.onFragmentDestroy();
                return;
            case 2:
                qd qdVar = (qd) obj;
                if (!qdVar.v.g()) {
                    qdVar.J.P(86);
                    qdVar.h.d();
                    return;
                }
                qdVar.J.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                if (u1Var != null) {
                    u1Var.F3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.sc scVar = ((org.telegram.ui.Components.sc[]) obj)[0];
                if (scVar != null) {
                    scVar.b();
                    return;
                }
                return;
            case 5:
                xo xoVar = (xo) obj;
                if (!xoVar.f44076s.g()) {
                    xoVar.R0.P(86);
                    xoVar.f44055b0.f22484e.d();
                    return;
                }
                xoVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33588x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                l70 l70Var = (l70) obj;
                if (!l70Var.N.g()) {
                    l70Var.R.P(86);
                    l70Var.f39648f.d();
                    return;
                }
                l70Var.R.N(0, false, false);
                return;
            case 8:
                hf0 hf0Var = (hf0) obj;
                org.telegram.ui.Components.fk0 fk0Var2 = hf0Var.I;
                nd ndVar = hf0Var.f38358n;
                if (!hf0Var.L.g()) {
                    ndVar.setAnimation(fk0Var2);
                    fk0Var2.P(86);
                    ndVar.setOnAnimationEndListener(new ud0(hf0Var, 2));
                    ndVar.d();
                    return;
                }
                ndVar.setAnimation(fk0Var2);
                fk0Var2.N(0, false, false);
                hf0Var.K = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
                return;
            case 10:
                ((PhotoViewer) obj).P1 = null;
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.U8;
                ((Runnable) obj).run();
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f34025s0.g()) {
                    privacyControlActivity.f34026t0.P(86);
                    privacyControlActivity.f34027u0.f22484e.d();
                    return;
                }
                privacyControlActivity.f34026t0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f34162q0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.li0 li0Var = profileActivity.f34051a0;
                    if (li0Var != null) {
                        org.telegram.ui.Components.ii0 j3 = org.telegram.ui.Components.li0.j(14, li0Var.f28191a);
                        if (j3 != null && (fk0Var = j3.f27158k) != null) {
                            fk0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.r8 r8Var = profileActivity.M2;
                    if (r8Var != null) {
                        r8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 14:
                ((n71) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f34323b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34324a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34390r = null;
                themeActivity.h = null;
                themeActivity.f34385n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((xi1) obj).f44022u0.b();
                return;
        }
    }
}
