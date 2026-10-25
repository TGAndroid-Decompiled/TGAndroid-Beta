package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class u5 implements DialogInterface.OnDismissListener {
    public final int f44012a;
    public final Object f44013b;

    public u5(Object obj, int i10) {
        this.f44012a = i10;
        this.f44013b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.xj0 xj0Var;
        int i10 = this.f44012a;
        Object obj = this.f44013b;
        switch (i10) {
            case 0:
                ((v5) obj).f44605a.u0(false);
                return;
            case 1:
                ((u9) obj).f44069b.onFragmentDestroy();
                return;
            case 2:
                nd ndVar = (nd) obj;
                if (!ndVar.f41867w.g()) {
                    ndVar.K.P(86);
                    ndVar.f41855n.d();
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
                mo moVar = (mo) obj;
                if (!moVar.f41617s.g()) {
                    moVar.Q0.P(86);
                    moVar.f41597b0.e.d();
                    return;
                }
                moVar.Q0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f35495x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                x60 x60Var = (x60) obj;
                if (!x60Var.N.g()) {
                    x60Var.R.P(86);
                    x60Var.f45665f.d();
                    return;
                }
                x60Var.R.N(0, false, false);
                return;
            case 8:
                re0 re0Var = (re0) obj;
                org.telegram.ui.Components.xj0 xj0Var2 = re0Var.I;
                kd kdVar = re0Var.f43126n;
                if (!re0Var.L.g()) {
                    kdVar.setAnimation(xj0Var2);
                    xj0Var2.P(86);
                    kdVar.setOnAnimationEndListener(new bd0(re0Var, 2));
                    kdVar.d();
                    return;
                }
                kdVar.setAnimation(xj0Var2);
                xj0Var2.N(0, false, false);
                re0Var.K = true;
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
                if (!privacyControlActivity.f35919r0.g()) {
                    privacyControlActivity.f35921s0.P(86);
                    privacyControlActivity.f35922t0.e.d();
                    return;
                }
                privacyControlActivity.f35921s0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f36058q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.bi0 bi0Var = profileActivity.Z;
                    if (bi0Var != null) {
                        org.telegram.ui.Components.yh0 j10 = org.telegram.ui.Components.bi0.j(14, bi0Var.f26855a);
                        if (j10 != null && (xj0Var = j10.f35048k) != null) {
                            xj0Var.start();
                        }
                    } else {
                        profileActivity.f36071s.d();
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
                ((c61) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f36218b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f36219a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f36281r = null;
                themeActivity.h = null;
                themeActivity.f36276n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ph1) obj).f42545u0.b();
                return;
        }
    }
}
