package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class s5 implements DialogInterface.OnDismissListener {
    public final int f36548a;
    public final Object f36549b;

    public s5(Object obj, int i10) {
        this.f36548a = i10;
        this.f36549b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.hj0 hj0Var;
        int i10 = this.f36548a;
        Object obj = this.f36549b;
        switch (i10) {
            case 0:
                ((t5) obj).f36838a.w0(false);
                return;
            case 1:
                ((q9) obj).f35994b.onFragmentDestroy();
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
                org.telegram.ui.Components.pc pcVar = ((org.telegram.ui.Components.pc[]) obj)[0];
                if (pcVar != null) {
                    pcVar.b();
                    return;
                }
                return;
            case 5:
                yo yoVar = (yo) obj;
                if (!yoVar.f39062s.h()) {
                    yoVar.R0.P(86);
                    yoVar.f39042b0.e.d();
                    return;
                }
                yoVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f29902x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                k70 k70Var = (k70) obj;
                if (!k70Var.N.h()) {
                    k70Var.R.P(86);
                    k70Var.f34250f.d();
                    return;
                }
                k70Var.R.N(0, false, false);
                return;
            case 8:
                hf0 hf0Var = (hf0) obj;
                org.telegram.ui.Components.hj0 hj0Var2 = hf0Var.I;
                kd kdVar = hf0Var.f33376n;
                if (!hf0Var.L.h()) {
                    kdVar.setAnimation(hj0Var2);
                    hj0Var2.P(86);
                    kdVar.setOnAnimationEndListener(new ud0(hf0Var, 2));
                    kdVar.d();
                    return;
                }
                kdVar.setAnimation(hj0Var2);
                hj0Var2.N(0, false, false);
                hf0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                kl0.f34413a = null;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
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
                if (!privacyControlActivity.f30326s0.h()) {
                    privacyControlActivity.f30327t0.P(86);
                    privacyControlActivity.f30328u0.e.d();
                    return;
                }
                privacyControlActivity.f30327t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f30461q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.nh0 nh0Var = profileActivity.f30351a0;
                    if (nh0Var != null) {
                        org.telegram.ui.Components.kh0 j3 = org.telegram.ui.Components.nh0.j(14, nh0Var.f25514a);
                        if (j3 != null && (hj0Var = j3.f24722k) != null) {
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
                ((l71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f30618b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f30619a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f30682r = null;
                themeActivity.h = null;
                themeActivity.f30677n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((zi1) obj).f39394u0.b();
                return;
        }
    }
}
