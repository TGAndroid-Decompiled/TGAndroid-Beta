package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class u5 implements DialogInterface.OnDismissListener {
    public final int f43867a;
    public final Object f43868b;

    public u5(Object obj, int i10) {
        this.f43867a = i10;
        this.f43868b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.yj0 yj0Var;
        int i10 = this.f43867a;
        Object obj = this.f43868b;
        switch (i10) {
            case 0:
                ((v5) obj).f44185a.u0(false);
                return;
            case 1:
                ((u9) obj).f43934b.onFragmentDestroy();
                return;
            case 2:
                nd ndVar = (nd) obj;
                if (!ndVar.f41771w.g()) {
                    ndVar.K.P(86);
                    ndVar.f41759n.d();
                    return;
                }
                ndVar.K.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                if (s1Var != null) {
                    s1Var.H3(-1);
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
                oo ooVar = (oo) obj;
                if (!ooVar.f42152s.g()) {
                    ooVar.Q0.P(86);
                    ooVar.f42132b0.e.d();
                    return;
                }
                ooVar.Q0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f35522x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                z60 z60Var = (z60) obj;
                if (!z60Var.N.g()) {
                    z60Var.R.P(86);
                    z60Var.f46175f.d();
                    return;
                }
                z60Var.R.N(0, false, false);
                return;
            case 8:
                te0 te0Var = (te0) obj;
                org.telegram.ui.Components.yj0 yj0Var2 = te0Var.I;
                kd kdVar = te0Var.f43614n;
                if (!te0Var.L.g()) {
                    kdVar.setAnimation(yj0Var2);
                    yj0Var2.P(86);
                    kdVar.setOnAnimationEndListener(new dd0(te0Var, 2));
                    kdVar.d();
                    return;
                }
                kdVar.setAnimation(yj0Var2);
                yj0Var2.N(0, false, false);
                te0Var.K = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.k3) obj).dismiss();
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
                if (!privacyControlActivity.f35946r0.g()) {
                    privacyControlActivity.f35948s0.P(86);
                    privacyControlActivity.f35949t0.e.d();
                    return;
                }
                privacyControlActivity.f35948s0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f36085q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.ci0 ci0Var = profileActivity.Z;
                    if (ci0Var != null) {
                        org.telegram.ui.Components.zh0 j10 = org.telegram.ui.Components.ci0.j(14, ci0Var.f27165a);
                        if (j10 != null && (yj0Var = j10.f35349k) != null) {
                            yj0Var.start();
                        }
                    } else {
                        profileActivity.f36098s.d();
                    }
                    org.telegram.ui.Cells.v8 v8Var = profileActivity.M2;
                    if (v8Var != null) {
                        v8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.U.N(0, false, false);
                profileActivity.V.N(0, false, false);
                return;
            case 14:
                ((f61) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f36245b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f36246a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f36308r = null;
                themeActivity.h = null;
                themeActivity.f36303n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((rh1) obj).f43038u0.b();
                return;
        }
    }
}
