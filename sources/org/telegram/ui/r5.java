package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f37183a;
    public final Object f37184b;

    public r5(Object obj, int i10) {
        this.f37183a = i10;
        this.f37184b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.jj0 jj0Var;
        int i10 = this.f37183a;
        Object obj = this.f37184b;
        switch (i10) {
            case 0:
                ((s5) obj).f37592a.w0(false);
                return;
            case 1:
                ((q9) obj).f36818b.onFragmentDestroy();
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
                if (!roVar.f37411s.h()) {
                    roVar.R0.P(86);
                    roVar.f37391b0.e.d();
                    return;
                }
                roVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31074x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                g70 g70Var = (g70) obj;
                if (!g70Var.N.h()) {
                    g70Var.R.P(86);
                    g70Var.f33837f.d();
                    return;
                }
                g70Var.R.N(0, false, false);
                return;
            case 8:
                bf0 bf0Var = (bf0) obj;
                org.telegram.ui.Components.jj0 jj0Var2 = bf0Var.I;
                id idVar = bf0Var.f32408n;
                if (!bf0Var.L.h()) {
                    idVar.setAnimation(jj0Var2);
                    jj0Var2.P(86);
                    idVar.setOnAnimationEndListener(new od0(bf0Var, 2));
                    idVar.d();
                    return;
                }
                idVar.setAnimation(jj0Var2);
                jj0Var2.N(0, false, false);
                bf0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                cl0.f32743a = null;
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
                if (!privacyControlActivity.f31499s0.h()) {
                    privacyControlActivity.f31500t0.P(86);
                    privacyControlActivity.f31501u0.e.d();
                    return;
                }
                privacyControlActivity.f31500t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f31634q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.ph0 ph0Var = profileActivity.f31524a0;
                    if (ph0Var != null) {
                        org.telegram.ui.Components.mh0 j3 = org.telegram.ui.Components.ph0.j(14, ph0Var.f27379a);
                        if (j3 != null && (jj0Var = j3.f26411k) != null) {
                            jj0Var.start();
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
                int i11 = ShareActivity.f31791b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f31792a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f31855r = null;
                themeActivity.h = null;
                themeActivity.f31850n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((mi1) obj).f35604u0.b();
                return;
        }
    }
}
