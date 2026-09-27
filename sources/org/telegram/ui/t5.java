package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class t5 implements DialogInterface.OnDismissListener {
    public final int f37648a;
    public final Object f37649b;

    public t5(Object obj, int i10) {
        this.f37648a = i10;
        this.f37649b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.kj0 kj0Var;
        int i10 = this.f37648a;
        Object obj = this.f37649b;
        switch (i10) {
            case 0:
                ((u5) obj).f38125a.w0(false);
                return;
            case 1:
                ((t9) obj).f37704b.onFragmentDestroy();
                return;
            case 2:
                nd ndVar = (nd) obj;
                if (!ndVar.v.h()) {
                    ndVar.J.P(86);
                    ndVar.h.d();
                    return;
                }
                ndVar.J.N(0, false, false);
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
                so soVar = (so) obj;
                if (!soVar.f37526s.h()) {
                    soVar.R0.P(86);
                    soVar.f37506b0.e.d();
                    return;
                }
                soVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31077x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                j70 j70Var = (j70) obj;
                if (!j70Var.N.h()) {
                    j70Var.R.P(86);
                    j70Var.f34647f.d();
                    return;
                }
                j70Var.R.N(0, false, false);
                return;
            case 8:
                ef0 ef0Var = (ef0) obj;
                org.telegram.ui.Components.kj0 kj0Var2 = ef0Var.I;
                kd kdVar = ef0Var.f33253n;
                if (!ef0Var.L.h()) {
                    kdVar.setAnimation(kj0Var2);
                    kj0Var2.P(86);
                    kdVar.setOnAnimationEndListener(new rd0(ef0Var, 2));
                    kdVar.d();
                    return;
                }
                kdVar.setAnimation(kj0Var2);
                kj0Var2.N(0, false, false);
                ef0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                fl0.f33584a = null;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.ActionBar.g3) obj).dismiss();
                return;
            case 11:
                ((PhotoViewer) obj).P1 = null;
                return;
            case 12:
                Drawable[] drawableArr = PhotoViewer.U8;
                ((Runnable) obj).run();
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f31502s0.h()) {
                    privacyControlActivity.f31503t0.P(86);
                    privacyControlActivity.f31504u0.e.d();
                    return;
                }
                privacyControlActivity.f31503t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f31637q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.qh0 qh0Var = profileActivity.f31527a0;
                    if (qh0Var != null) {
                        org.telegram.ui.Components.nh0 j3 = org.telegram.ui.Components.qh0.j(14, qh0Var.f27730a);
                        if (j3 != null && (kj0Var = j3.f26825k) != null) {
                            kj0Var.start();
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
            case 15:
                ((c71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f31794b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f31795a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f31858r = null;
                themeActivity.h = null;
                themeActivity.f31853n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ki1) obj).f35082u0.b();
                return;
        }
    }
}
