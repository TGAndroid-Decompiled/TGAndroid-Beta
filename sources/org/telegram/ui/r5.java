package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f36962a;
    public final Object f36963b;

    public r5(Object obj, int i10) {
        this.f36962a = i10;
        this.f36963b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ij0 ij0Var;
        int i10 = this.f36962a;
        Object obj = this.f36963b;
        switch (i10) {
            case 0:
                ((s5) obj).f37197a.w0(false);
                return;
            case 1:
                ((r9) obj).f36990b.onFragmentDestroy();
                return;
            case 2:
                md mdVar = (md) obj;
                if (!mdVar.v.h()) {
                    mdVar.J.P(86);
                    mdVar.h.d();
                    return;
                }
                mdVar.J.N(0, false, false);
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
                uo uoVar = (uo) obj;
                if (!uoVar.f38057s.h()) {
                    uoVar.R0.P(86);
                    uoVar.f38037b0.e.d();
                    return;
                }
                uoVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31033x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                l70 l70Var = (l70) obj;
                if (!l70Var.N.h()) {
                    l70Var.R.P(86);
                    l70Var.f35270f.d();
                    return;
                }
                l70Var.R.N(0, false, false);
                return;
            case 8:
                if0 if0Var = (if0) obj;
                org.telegram.ui.Components.ij0 ij0Var2 = if0Var.I;
                jd jdVar = if0Var.f34515n;
                if (!if0Var.L.h()) {
                    jdVar.setAnimation(ij0Var2);
                    ij0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new vd0(if0Var, 2));
                    jdVar.d();
                    return;
                }
                jdVar.setAnimation(ij0Var2);
                ij0Var2.N(0, false, false);
                if0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                ll0.f35398a = null;
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
                if (!privacyControlActivity.f31458s0.h()) {
                    privacyControlActivity.f31459t0.P(86);
                    privacyControlActivity.f31460u0.e.d();
                    return;
                }
                privacyControlActivity.f31459t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f31593q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.oh0 oh0Var = profileActivity.f31483a0;
                    if (oh0Var != null) {
                        org.telegram.ui.Components.lh0 j3 = org.telegram.ui.Components.oh0.j(14, oh0Var.f26936a);
                        if (j3 != null && (ij0Var = j3.f26148k) != null) {
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
                ((g71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f31750b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f31751a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f31814r = null;
                themeActivity.h = null;
                themeActivity.f31809n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((si1) obj).f37333u0.b();
                return;
        }
    }
}
