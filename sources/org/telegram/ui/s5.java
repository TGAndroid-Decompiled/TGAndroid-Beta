package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class s5 implements DialogInterface.OnDismissListener {
    public final int f40348a;
    public final Object f40349b;

    public s5(Object obj, int i10) {
        this.f40348a = i10;
        this.f40349b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.kj0 kj0Var;
        int i10 = this.f40348a;
        Object obj = this.f40349b;
        switch (i10) {
            case 0:
                ((t5) obj).f40688a.A0(false);
                return;
            case 1:
                ((s9) obj).f40395b.onFragmentDestroy();
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
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                if (u1Var != null) {
                    u1Var.F3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.rc rcVar = ((org.telegram.ui.Components.rc[]) obj)[0];
                if (rcVar != null) {
                    rcVar.b();
                    return;
                }
                return;
            case 5:
                to toVar = (to) obj;
                if (!toVar.f40905s.h()) {
                    toVar.R0.P(86);
                    toVar.f40884b0.f22722e.d();
                    return;
                }
                toVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33739x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                k70 k70Var = (k70) obj;
                if (!k70Var.N.h()) {
                    k70Var.R.P(86);
                    k70Var.f37843f.d();
                    return;
                }
                k70Var.R.N(0, false, false);
                return;
            case 8:
                ff0 ff0Var = (ff0) obj;
                org.telegram.ui.Components.kj0 kj0Var2 = ff0Var.I;
                kd kdVar = ff0Var.f36289n;
                if (!ff0Var.L.h()) {
                    kdVar.setAnimation(kj0Var2);
                    kj0Var2.P(86);
                    kdVar.setOnAnimationEndListener(new sd0(ff0Var, 2));
                    kdVar.d();
                    return;
                }
                kdVar.setAnimation(kj0Var2);
                kj0Var2.N(0, false, false);
                ff0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                gl0.f36670a = null;
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
                if (!privacyControlActivity.f34176s0.h()) {
                    privacyControlActivity.f34177t0.P(86);
                    privacyControlActivity.f34178u0.f22722e.d();
                    return;
                }
                privacyControlActivity.f34177t0.N(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f34313q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.qh0 qh0Var = profileActivity.f34202a0;
                    if (qh0Var != null) {
                        org.telegram.ui.Components.nh0 j3 = org.telegram.ui.Components.qh0.j(14, qh0Var.f30027a);
                        if (j3 != null && (kj0Var = j3.f28973k) != null) {
                            kj0Var.start();
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
                ((c71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f34474b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34475a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34541r = null;
                themeActivity.h = null;
                themeActivity.f34536n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((mi1) obj).f38642u0.b();
                return;
        }
    }
}
