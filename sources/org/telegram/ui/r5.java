package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f37044a;
    public final Object f37045b;

    public r5(Object obj, int i10) {
        this.f37044a = i10;
        this.f37045b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.hj0 hj0Var;
        int i10 = this.f37044a;
        Object obj = this.f37045b;
        switch (i10) {
            case 0:
                ((s5) obj).f37296a.w0(false);
                return;
            case 1:
                ((r9) obj).f37068b.onFragmentDestroy();
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
                org.telegram.ui.Components.pc pcVar = ((org.telegram.ui.Components.pc[]) obj)[0];
                if (pcVar != null) {
                    pcVar.b();
                    return;
                }
                return;
            case 5:
                uo uoVar = (uo) obj;
                if (!uoVar.f38166s.h()) {
                    uoVar.R0.P(86);
                    uoVar.f38146b0.e.d();
                    return;
                }
                uoVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31073x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                l70 l70Var = (l70) obj;
                if (!l70Var.N.h()) {
                    l70Var.R.P(86);
                    l70Var.f35337f.d();
                    return;
                }
                l70Var.R.N(0, false, false);
                return;
            case 8:
                jf0 jf0Var = (jf0) obj;
                org.telegram.ui.Components.hj0 hj0Var2 = jf0Var.I;
                jd jdVar = jf0Var.f34916n;
                if (!jf0Var.L.h()) {
                    jdVar.setAnimation(hj0Var2);
                    hj0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new wd0(jf0Var, 2));
                    jdVar.d();
                    return;
                }
                jdVar.setAnimation(hj0Var2);
                hj0Var2.N(0, false, false);
                jf0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                ll0.f35472a = null;
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
                if (!privacyControlActivity.f31498s0.h()) {
                    privacyControlActivity.f31499t0.P(86);
                    privacyControlActivity.f31500u0.e.d();
                    return;
                }
                privacyControlActivity.f31499t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f31633q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.nh0 nh0Var = profileActivity.f31523a0;
                    if (nh0Var != null) {
                        org.telegram.ui.Components.kh0 j3 = org.telegram.ui.Components.nh0.j(14, nh0Var.f26640a);
                        if (j3 != null && (hj0Var = j3.f25786k) != null) {
                            hj0Var.start();
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
                ((j71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f31790b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f31791a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f31854r = null;
                themeActivity.h = null;
                themeActivity.f31849n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ti1) obj).f37807u0.b();
                return;
        }
    }
}
