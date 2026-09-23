package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class s5 implements DialogInterface.OnDismissListener {
    public final int f37115a;
    public final Object f37116b;

    public s5(Object obj, int i10) {
        this.f37115a = i10;
        this.f37116b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.yi0 yi0Var;
        int i10 = this.f37115a;
        Object obj = this.f37116b;
        switch (i10) {
            case 0:
                ((t5) obj).f37532a.w0(false);
                return;
            case 1:
                ((q9) obj).f36322b.onFragmentDestroy();
                return;
            case 2:
                ld ldVar = (ld) obj;
                if (!ldVar.v.h()) {
                    ldVar.J.P(86);
                    ldVar.h.d();
                    return;
                }
                ldVar.J.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                if (t1Var != null) {
                    t1Var.F3(-1);
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
                if (!soVar.f37366s.h()) {
                    soVar.R0.P(86);
                    soVar.f37346b0.e.d();
                    return;
                }
                soVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f30760x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                i70 i70Var = (i70) obj;
                if (!i70Var.N.h()) {
                    i70Var.R.P(86);
                    i70Var.f34046f.d();
                    return;
                }
                i70Var.R.N(0, false, false);
                return;
            case 8:
                cf0 cf0Var = (cf0) obj;
                org.telegram.ui.Components.yi0 yi0Var2 = cf0Var.I;
                id idVar = cf0Var.f32333n;
                if (!cf0Var.L.h()) {
                    idVar.setAnimation(yi0Var2);
                    yi0Var2.P(86);
                    idVar.setOnAnimationEndListener(new pd0(cf0Var, 2));
                    idVar.d();
                    return;
                }
                idVar.setAnimation(yi0Var2);
                yi0Var2.N(0, false, false);
                cf0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                cl0.f32369a = null;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
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
                if (!privacyControlActivity.f31185s0.h()) {
                    privacyControlActivity.f31186t0.P(86);
                    privacyControlActivity.f31187u0.e.d();
                    return;
                }
                privacyControlActivity.f31186t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f31320q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.eh0 eh0Var = profileActivity.f31210a0;
                    if (eh0Var != null) {
                        org.telegram.ui.Components.bh0 j3 = org.telegram.ui.Components.eh0.j(14, eh0Var.f23686a);
                        if (j3 != null && (yi0Var = j3.f22747k) != null) {
                            yi0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.s8 s8Var = profileActivity.M2;
                    if (s8Var != null) {
                        s8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 15:
                ((z61) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f31477b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f31478a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f31541r = null;
                themeActivity.h = null;
                themeActivity.f31536n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((mi1) obj).f35339u0.b();
                return;
        }
    }
}
