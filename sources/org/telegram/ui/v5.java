package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class v5 implements DialogInterface.OnDismissListener {
    public final int f42610a;
    public final Object f42611b;

    public v5(Object obj, int i10) {
        this.f42610a = i10;
        this.f42611b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.yj0 yj0Var;
        int i10 = this.f42610a;
        Object obj = this.f42611b;
        switch (i10) {
            case 0:
                ((w5) obj).f42926a.x0(false);
                return;
            case 1:
                ((s9) obj).f41324b.onFragmentDestroy();
                return;
            case 2:
                md mdVar = (md) obj;
                if (!mdVar.f39502w.g()) {
                    mdVar.K.P(86);
                    mdVar.f39490n.d();
                    return;
                }
                mdVar.K.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                if (t1Var != null) {
                    t1Var.E3(-1);
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
                if (!koVar.f39006s.g()) {
                    koVar.Q0.P(86);
                    koVar.f38986b0.e.d();
                    return;
                }
                koVar.Q0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33432x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                w60 w60Var = (w60) obj;
                if (!w60Var.N.g()) {
                    w60Var.R.P(86);
                    w60Var.f42938f.d();
                    return;
                }
                w60Var.R.N(0, false, false);
                return;
            case 8:
                ue0 ue0Var = (ue0) obj;
                org.telegram.ui.Components.yj0 yj0Var2 = ue0Var.I;
                jd jdVar = ue0Var.f42397n;
                if (!ue0Var.L.g()) {
                    jdVar.setAnimation(yj0Var2);
                    yj0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new ed0(ue0Var, 2));
                    jdVar.d();
                    return;
                }
                jdVar.setAnimation(yj0Var2);
                yj0Var2.N(0, false, false);
                ue0Var.K = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
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
                if (!privacyControlActivity.f33859t0.g()) {
                    privacyControlActivity.f33860u0.P(86);
                    privacyControlActivity.f33861v0.e.d();
                    return;
                }
                privacyControlActivity.f33860u0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f34001r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.ci0 ci0Var = profileActivity.f33883a0;
                    if (ci0Var != null) {
                        org.telegram.ui.Components.zh0 j10 = org.telegram.ui.Components.ci0.j(14, ci0Var.f25337a);
                        if (j10 != null && (yj0Var = j10.f33232k) != null) {
                            yj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.r8 r8Var = profileActivity.N2;
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
                ((b61) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f34155b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34156a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34219r = null;
                themeActivity.h = null;
                themeActivity.f34214n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((oh1) obj).f40201u0.b();
                return;
        }
    }
}
