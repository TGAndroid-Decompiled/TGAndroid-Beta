package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f37184a;
    public final Object f37185b;

    public r5(Object obj, int i10) {
        this.f37184a = i10;
        this.f37185b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ij0 ij0Var;
        int i10 = this.f37184a;
        Object obj = this.f37185b;
        switch (i10) {
            case 0:
                ((s5) obj).f37593a.w0(false);
                return;
            case 1:
                ((q9) obj).f36819b.onFragmentDestroy();
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
                ro roVar = (ro) obj;
                if (!roVar.f37412s.h()) {
                    roVar.R0.P(86);
                    roVar.f37392b0.e.d();
                    return;
                }
                roVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31075x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                g70 g70Var = (g70) obj;
                if (!g70Var.N.h()) {
                    g70Var.R.P(86);
                    g70Var.f33838f.d();
                    return;
                }
                g70Var.R.N(0, false, false);
                return;
            case 8:
                bf0 bf0Var = (bf0) obj;
                org.telegram.ui.Components.ij0 ij0Var2 = bf0Var.I;
                id idVar = bf0Var.f32409n;
                if (!bf0Var.L.h()) {
                    idVar.setAnimation(ij0Var2);
                    ij0Var2.P(86);
                    idVar.setOnAnimationEndListener(new od0(bf0Var, 2));
                    idVar.d();
                    return;
                }
                idVar.setAnimation(ij0Var2);
                ij0Var2.N(0, false, false);
                bf0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                cl0.f32744a = null;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
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
                if (!privacyControlActivity.f31500s0.h()) {
                    privacyControlActivity.f31501t0.P(86);
                    privacyControlActivity.f31502u0.e.d();
                    return;
                }
                privacyControlActivity.f31501t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f31635q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.oh0 oh0Var = profileActivity.f31525a0;
                    if (oh0Var != null) {
                        org.telegram.ui.Components.lh0 j3 = org.telegram.ui.Components.oh0.j(14, oh0Var.f27072a);
                        if (j3 != null && (ij0Var = j3.f26102k) != null) {
                            ij0Var.start();
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
                ((a71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f31792b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f31793a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f31856r = null;
                themeActivity.h = null;
                themeActivity.f31851n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((mi1) obj).f35605u0.b();
                return;
        }
    }
}
