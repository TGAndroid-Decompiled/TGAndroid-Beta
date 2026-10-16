package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class v5 implements DialogInterface.OnDismissListener {
    public final int f40586a;
    public final Object f40587b;

    public v5(Object obj, int i10) {
        this.f40586a = i10;
        this.f40587b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.yj0 yj0Var;
        int i10 = this.f40586a;
        Object obj = this.f40587b;
        switch (i10) {
            case 0:
                ((w5) obj).f40860a.x0(false);
                return;
            case 1:
                ((u9) obj).f40294b.onFragmentDestroy();
                return;
            case 2:
                sd sdVar = (sd) obj;
                if (!sdVar.v.g()) {
                    sdVar.J.P(86);
                    sdVar.h.d();
                    return;
                }
                sdVar.J.N(0, false, false);
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
                zo zoVar = (zo) obj;
                if (!zoVar.f42386s.g()) {
                    zoVar.R0.P(86);
                    zoVar.f42366b0.e.d();
                    return;
                }
                zoVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31780x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                p70 p70Var = (p70) obj;
                if (!p70Var.N.g()) {
                    p70Var.R.P(86);
                    p70Var.f38827f.d();
                    return;
                }
                p70Var.R.N(0, false, false);
                return;
            case 8:
                lf0 lf0Var = (lf0) obj;
                org.telegram.ui.Components.yj0 yj0Var2 = lf0Var.I;
                pd pdVar = lf0Var.f37734n;
                if (!lf0Var.L.g()) {
                    pdVar.setAnimation(yj0Var2);
                    yj0Var2.P(86);
                    pdVar.setOnAnimationEndListener(new xd0(lf0Var, 2));
                    pdVar.d();
                    return;
                }
                pdVar.setAnimation(yj0Var2);
                yj0Var2.N(0, false, false);
                lf0Var.K = true;
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
                if (!privacyControlActivity.f32206s0.g()) {
                    privacyControlActivity.f32207t0.P(86);
                    privacyControlActivity.f32208u0.e.d();
                    return;
                }
                privacyControlActivity.f32207t0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f32342q0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.ei0 ei0Var = profileActivity.f32231a0;
                    if (ei0Var != null) {
                        org.telegram.ui.Components.bi0 j10 = org.telegram.ui.Components.ei0.j(14, ei0Var.f24394a);
                        if (j10 != null && (yj0Var = j10.f23467k) != null) {
                            yj0Var.start();
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
                ((r71) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f32499b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f32500a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f32563r = null;
                themeActivity.h = null;
                themeActivity.f32558n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((cj1) obj).f34714u0.b();
                return;
        }
    }
}
