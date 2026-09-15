package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f37021a;
    public final Object f37022b;

    public r5(Object obj, int i10) {
        this.f37021a = i10;
        this.f37022b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.xi0 xi0Var;
        int i10 = this.f37021a;
        Object obj = this.f37022b;
        switch (i10) {
            case 0:
                ((s5) obj).f37253a.w0(false);
                return;
            case 1:
                ((q9) obj).f36805b.onFragmentDestroy();
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
                org.telegram.ui.Components.oc ocVar = ((org.telegram.ui.Components.oc[]) obj)[0];
                if (ocVar != null) {
                    ocVar.b();
                    return;
                }
                return;
            case 5:
                wo woVar = (wo) obj;
                if (!woVar.f39292s.h()) {
                    woVar.R0.P(86);
                    woVar.f39272b0.e.d();
                    return;
                }
                woVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f30789x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                l70 l70Var = (l70) obj;
                if (!l70Var.N.h()) {
                    l70Var.R.P(86);
                    l70Var.f35358f.d();
                    return;
                }
                l70Var.R.N(0, false, false);
                return;
            case 8:
                hf0 hf0Var = (hf0) obj;
                org.telegram.ui.Components.xi0 xi0Var2 = hf0Var.I;
                id idVar = hf0Var.f34264n;
                if (!hf0Var.L.h()) {
                    idVar.setAnimation(xi0Var2);
                    xi0Var2.P(86);
                    idVar.setOnAnimationEndListener(new ud0(hf0Var, 2));
                    idVar.d();
                    return;
                }
                idVar.setAnimation(xi0Var2);
                xi0Var2.N(0, false, false);
                hf0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                il0.f34704a = null;
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
                Drawable[] drawableArr = PhotoViewer.T8;
                ((Runnable) obj).run();
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f31213s0.h()) {
                    privacyControlActivity.f31214t0.P(86);
                    privacyControlActivity.f31215u0.e.d();
                    return;
                }
                privacyControlActivity.f31214t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f31349q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.dh0 dh0Var = profileActivity.f31239a0;
                    if (dh0Var != null) {
                        org.telegram.ui.Components.ah0 j3 = org.telegram.ui.Components.dh0.j(14, dh0Var.f23325a);
                        if (j3 != null && (xi0Var = j3.f22403k) != null) {
                            xi0Var.start();
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
                ((g71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f31506b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f31507a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f31570r = null;
                themeActivity.h = null;
                themeActivity.f31565n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ti1) obj).f37731u0.b();
                return;
        }
    }
}
