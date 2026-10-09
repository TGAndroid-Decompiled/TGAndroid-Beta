package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f41263a;
    public final Object f41264b;

    public r5(Object obj, int i10) {
        this.f41263a = i10;
        this.f41264b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ck0 ck0Var;
        int i10 = this.f41263a;
        Object obj = this.f41264b;
        switch (i10) {
            case 0:
                ((s5) obj).f41578a.x0(false);
                return;
            case 1:
                ((q9) obj).f41044b.onFragmentDestroy();
                return;
            case 2:
                md mdVar = (md) obj;
                if (!mdVar.v.g()) {
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
                org.telegram.ui.Components.tc tcVar = ((org.telegram.ui.Components.tc[]) obj)[0];
                if (tcVar != null) {
                    tcVar.b();
                    return;
                }
                return;
            case 5:
                uo uoVar = (uo) obj;
                if (!uoVar.f42486s.g()) {
                    uoVar.R0.P(86);
                    uoVar.f42465b0.f22720e.d();
                    return;
                }
                uoVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33749x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                j70 j70Var = (j70) obj;
                if (!j70Var.N.g()) {
                    j70Var.R.P(86);
                    j70Var.f38847f.d();
                    return;
                }
                j70Var.R.N(0, false, false);
                return;
            case 8:
                gf0 gf0Var = (gf0) obj;
                org.telegram.ui.Components.ck0 ck0Var2 = gf0Var.I;
                jd jdVar = gf0Var.f38003n;
                if (!gf0Var.L.g()) {
                    jdVar.setAnimation(ck0Var2);
                    ck0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new td0(gf0Var, 2));
                    jdVar.d();
                    return;
                }
                jdVar.setAnimation(ck0Var2);
                ck0Var2.N(0, false, false);
                gf0Var.K = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                return;
            case 10:
                ((PhotoViewer) obj).P1 = null;
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.U8;
                ((Runnable) obj).run();
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f34186s0.g()) {
                    privacyControlActivity.f34187t0.P(86);
                    privacyControlActivity.f34188u0.f22720e.d();
                    return;
                }
                privacyControlActivity.f34187t0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f34323q0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.ii0 ii0Var = profileActivity.f34212a0;
                    if (ii0Var != null) {
                        org.telegram.ui.Components.fi0 j3 = org.telegram.ui.Components.ii0.j(14, ii0Var.f27394a);
                        if (j3 != null && (ck0Var = j3.f26381k) != null) {
                            ck0Var.start();
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
            case 14:
                ((k71) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f34484b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34485a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34551r = null;
                themeActivity.h = null;
                themeActivity.f34546n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((wi1) obj).f43663u0.b();
                return;
        }
    }
}
