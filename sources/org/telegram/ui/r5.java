package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f42270a;
    public final Object f42271b;

    public r5(Object obj, int i9) {
        this.f42270a = i9;
        this.f42271b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.mi0 mi0Var;
        int i9 = this.f42270a;
        Object obj = this.f42271b;
        switch (i9) {
            case 0:
                ((s5) obj).f42562a.v0(false);
                return;
            case 1:
                ((o9) obj).f41010b.onFragmentDestroy();
                return;
            case 2:
                id idVar = (id) obj;
                if (!idVar.v.h()) {
                    idVar.F.N(86);
                    idVar.h.d();
                    return;
                }
                idVar.F.L(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                if (t1Var != null) {
                    t1Var.F3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.gc gcVar = ((org.telegram.ui.Components.gc[]) obj)[0];
                if (gcVar != null) {
                    gcVar.b();
                    return;
                }
                return;
            case 5:
                ho hoVar = (ho) obj;
                if (!hoVar.f38859s.h()) {
                    hoVar.N0.N(86);
                    hoVar.X.f24875e.d();
                    return;
                }
                hoVar.N0.L(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f35465x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                r60 r60Var = (r60) obj;
                if (!r60Var.J.h()) {
                    r60Var.N.N(86);
                    r60Var.f42281f.d();
                    return;
                }
                r60Var.N.L(0, false, false);
                return;
            case 8:
                qe0 qe0Var = (qe0) obj;
                org.telegram.ui.Components.mi0 mi0Var2 = qe0Var.E;
                fd fdVar = qe0Var.f41776n;
                if (!qe0Var.H.h()) {
                    fdVar.setAnimation(mi0Var2);
                    mi0Var2.N(86);
                    fdVar.setOnAnimationEndListener(new bd0(qe0Var, 2));
                    fdVar.d();
                    return;
                }
                fdVar.setAnimation(mi0Var2);
                mi0Var2.L(0, false, false);
                qe0Var.G = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                tk0.f43026a = null;
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
                ((PhotoViewer) obj).L1 = null;
                return;
            case 12:
                Drawable[] drawableArr = PhotoViewer.P8;
                ((Runnable) obj).run();
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f35890o0.h()) {
                    privacyControlActivity.f35891p0.N(86);
                    privacyControlActivity.f35892q0.f24875e.d();
                    return;
                }
                privacyControlActivity.f35891p0.L(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.m0.h()) {
                    profileActivity.R.N(86);
                    profileActivity.S.N(86);
                    org.telegram.ui.Components.pg0 pg0Var = profileActivity.W;
                    if (pg0Var != null) {
                        org.telegram.ui.Components.mg0 j10 = org.telegram.ui.Components.pg0.j(14, pg0Var.f31648a);
                        if (j10 != null && (mi0Var = j10.f30822k) != null) {
                            mi0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.p8 p8Var = profileActivity.I2;
                    if (p8Var != null) {
                        p8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.R.L(0, false, false);
                profileActivity.S.L(0, false, false);
                return;
            case 15:
                ((b61) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i10 = ShareActivity.f36184b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f36185a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f36247r = null;
                themeActivity.h = null;
                themeActivity.f36242n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((mh1) obj).f40458q0.b();
                return;
        }
    }
}
