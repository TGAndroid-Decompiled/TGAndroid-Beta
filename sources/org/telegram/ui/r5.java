package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f37079a;
    public final Object f37080b;

    public r5(Object obj, int i10) {
        this.f37079a = i10;
        this.f37080b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.yi0 yi0Var;
        int i10 = this.f37079a;
        Object obj = this.f37080b;
        switch (i10) {
            case 0:
                ((s5) obj).f37383a.w0(false);
                return;
            case 1:
                ((s9) obj).f37418b.onFragmentDestroy();
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
                if (!woVar.f39105s.h()) {
                    woVar.R0.P(86);
                    woVar.f39085b0.e.d();
                    return;
                }
                woVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f30803x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                n70 n70Var = (n70) obj;
                if (!n70Var.N.h()) {
                    n70Var.R.P(86);
                    n70Var.f35959f.d();
                    return;
                }
                n70Var.R.N(0, false, false);
                return;
            case 8:
                jf0 jf0Var = (jf0) obj;
                org.telegram.ui.Components.yi0 yi0Var2 = jf0Var.I;
                kd kdVar = jf0Var.f34867n;
                if (!jf0Var.L.h()) {
                    kdVar.setAnimation(yi0Var2);
                    yi0Var2.P(86);
                    kdVar.setOnAnimationEndListener(new wd0(jf0Var, 2));
                    kdVar.d();
                    return;
                }
                kdVar.setAnimation(yi0Var2);
                yi0Var2.N(0, false, false);
                jf0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                kl0.f35305a = null;
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
                Drawable[] drawableArr = PhotoViewer.T8;
                ((Runnable) obj).run();
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f31227s0.h()) {
                    privacyControlActivity.f31228t0.P(86);
                    privacyControlActivity.f31229u0.e.d();
                    return;
                }
                privacyControlActivity.f31228t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f31362q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.eh0 eh0Var = profileActivity.f31252a0;
                    if (eh0Var != null) {
                        org.telegram.ui.Components.bh0 j3 = org.telegram.ui.Components.eh0.j(14, eh0Var.f23555a);
                        if (j3 != null && (yi0Var = j3.f22735k) != null) {
                            yi0Var.start();
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
                ((i71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f31519b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f31520a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f31583r = null;
                themeActivity.h = null;
                themeActivity.f31578n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ti1) obj).f37794u0.b();
                return;
        }
    }
}
