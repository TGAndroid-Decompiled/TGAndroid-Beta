package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

public final class s5 implements DialogInterface.OnDismissListener {

    public final int f42407a;

    public final Object f42408b;

    public s5(Object obj, int i10) {
        this.f42407a = i10;
        this.f42408b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.oi0 oi0Var;
        int i10 = this.f42407a;
        Object obj = this.f42408b;
        switch (i10) {
            case 0:
                ((t5) obj).f42783a.w0(false);
                break;
            case 1:
                ((p9) obj).f41300b.onFragmentDestroy();
                break;
            case 2:
                id idVar = (id) obj;
                if (!idVar.v.h()) {
                    idVar.F.N(86);
                    idVar.h.d();
                } else {
                    idVar.F.L(0, false, false);
                }
                break;
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                if (s1Var != null) {
                    s1Var.E3(-1);
                }
                break;
            case 4:
                org.telegram.ui.Components.ec ecVar = ((org.telegram.ui.Components.ec[]) obj)[0];
                if (ecVar != null) {
                    ecVar.b();
                }
                break;
            case 5:
                jo joVar = (jo) obj;
                if (!joVar.f39427s.h()) {
                    joVar.N0.N(86);
                    joVar.X.f24631e.d();
                } else {
                    joVar.N0.L(0, false, false);
                }
                break;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f35468x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                u60 u60Var = (u60) obj;
                if (!u60Var.J.h()) {
                    u60Var.N.N(86);
                    u60Var.f43137f.d();
                } else {
                    u60Var.N.L(0, false, false);
                }
                break;
            case 8:
                te0 te0Var = (te0) obj;
                org.telegram.ui.Components.oi0 oi0Var2 = te0Var.E;
                fd fdVar = te0Var.f42920n;
                if (!te0Var.H.h()) {
                    fdVar.setAnimation(oi0Var2);
                    oi0Var2.N(86);
                    fdVar.setOnAnimationEndListener(new fd0(te0Var, 2));
                    fdVar.d();
                } else {
                    fdVar.setAnimation(oi0Var2);
                    oi0Var2.L(0, false, false);
                    te0Var.G = true;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                tk0.f42959a = null;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                break;
            case 10:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
                break;
            case 11:
                ((PhotoViewer) obj).L1 = null;
                break;
            case 12:
                Drawable[] drawableArr = PhotoViewer.P8;
                ((Runnable) obj).run();
                break;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f35893o0.h()) {
                    privacyControlActivity.f35894p0.N(86);
                    privacyControlActivity.f35895q0.f24631e.d();
                } else {
                    privacyControlActivity.f35894p0.L(0, false, false);
                }
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.m0.h()) {
                    profileActivity.R.N(86);
                    profileActivity.S.N(86);
                    org.telegram.ui.Components.rg0 rg0Var = profileActivity.W;
                    if (rg0Var != null) {
                        org.telegram.ui.Components.og0 og0VarJ = org.telegram.ui.Components.rg0.j(14, rg0Var.f32157a);
                        if (og0VarJ != null && (oi0Var = og0VarJ.f31288k) != null) {
                            oi0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.l8 l8Var = profileActivity.I2;
                    if (l8Var != null) {
                        l8Var.getImageView().d();
                    }
                } else {
                    profileActivity.R.L(0, false, false);
                    profileActivity.S.L(0, false, false);
                }
                break;
            case 15:
                ((a61) obj).w(0.0f);
                break;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f36187b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f36188a = null;
                break;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f36250r = null;
                themeActivity.h = null;
                themeActivity.f36245n = null;
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                break;
            default:
                ((lh1) obj).f40119q0.b();
                break;
        }
    }
}
