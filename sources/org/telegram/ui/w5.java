package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class w5 implements DialogInterface.OnDismissListener {
    public final int f42357a;
    public final Object f42358b;

    public w5(Object obj, int i10) {
        this.f42357a = i10;
        this.f42358b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.uj0 uj0Var;
        int i10 = this.f42357a;
        Object obj = this.f42358b;
        switch (i10) {
            case 0:
                ((x5) obj).f42979a.x0(false);
                return;
            case 1:
                ((t9) obj).f41615b.onFragmentDestroy();
                return;
            case 2:
                od odVar = (od) obj;
                if (!odVar.v.g()) {
                    odVar.J.P(86);
                    odVar.h.d();
                    return;
                }
                odVar.J.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                if (u1Var != null) {
                    u1Var.F3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.qc qcVar = ((org.telegram.ui.Components.qc[]) obj)[0];
                if (qcVar != null) {
                    qcVar.b();
                    return;
                }
                return;
            case 5:
                ko koVar = (ko) obj;
                if (!koVar.f38569s.g()) {
                    koVar.R0.P(86);
                    koVar.f38549b0.e.d();
                    return;
                }
                koVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33118x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                u60 u60Var = (u60) obj;
                if (!u60Var.N.g()) {
                    u60Var.R.P(86);
                    u60Var.f41867f.d();
                    return;
                }
                u60Var.R.N(0, false, false);
                return;
            case 8:
                pe0 pe0Var = (pe0) obj;
                org.telegram.ui.Components.uj0 uj0Var2 = pe0Var.I;
                ld ldVar = pe0Var.f40076n;
                if (!pe0Var.L.g()) {
                    ldVar.setAnimation(uj0Var2);
                    uj0Var2.P(86);
                    ldVar.setOnAnimationEndListener(new bd0(pe0Var, 2));
                    ldVar.d();
                    return;
                }
                ldVar.setAnimation(uj0Var2);
                uj0Var2.N(0, false, false);
                pe0Var.K = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
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
                if (!privacyControlActivity.f33544s0.g()) {
                    privacyControlActivity.f33545t0.P(86);
                    privacyControlActivity.f33546u0.e.d();
                    return;
                }
                privacyControlActivity.f33545t0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f33687r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.yh0 yh0Var = profileActivity.f33569a0;
                    if (yh0Var != null) {
                        org.telegram.ui.Components.vh0 j10 = org.telegram.ui.Components.yh0.j(14, yh0Var.f32631a);
                        if (j10 != null && (uj0Var = j10.f31286k) != null) {
                            uj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.q8 q8Var = profileActivity.N2;
                    if (q8Var != null) {
                        q8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 14:
                ((z51) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f33839b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f33840a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f33903r = null;
                themeActivity.h = null;
                themeActivity.f33898n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((jh1) obj).f38210u0.b();
                return;
        }
    }
}
