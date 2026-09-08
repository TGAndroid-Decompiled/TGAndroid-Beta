package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r5 implements DialogInterface.OnDismissListener {
    public final int f40098a;
    public final Object f40099b;

    public r5(Object obj, int i10) {
        this.f40098a = i10;
        this.f40099b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.xi0 xi0Var;
        int i10 = this.f40098a;
        Object obj = this.f40099b;
        switch (i10) {
            case 0:
                ((s5) obj).f40328a.w0(false);
                return;
            case 1:
                ((q9) obj).f39782b.onFragmentDestroy();
                return;
            case 2:
                md mdVar = (md) obj;
                if (!mdVar.v.h()) {
                    mdVar.J.N(86);
                    mdVar.h.d();
                    return;
                }
                mdVar.J.L(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                if (t1Var != null) {
                    t1Var.F3(-1);
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
                xo xoVar = (xo) obj;
                if (!xoVar.f42818s.h()) {
                    xoVar.R0.N(86);
                    xoVar.f42797b0.f22710e.d();
                    return;
                }
                xoVar.R0.L(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33422x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                l70 l70Var = (l70) obj;
                if (!l70Var.N.h()) {
                    l70Var.R.N(86);
                    l70Var.f38238f.d();
                    return;
                }
                l70Var.R.L(0, false, false);
                return;
            case 8:
                hf0 hf0Var = (hf0) obj;
                org.telegram.ui.Components.xi0 xi0Var2 = hf0Var.I;
                jd jdVar = hf0Var.f37012n;
                if (!hf0Var.L.h()) {
                    jdVar.setAnimation(xi0Var2);
                    xi0Var2.N(86);
                    jdVar.setOnAnimationEndListener(new ud0(hf0Var, 2));
                    jdVar.d();
                    return;
                }
                jdVar.setAnimation(xi0Var2);
                xi0Var2.L(0, false, false);
                hf0Var.K = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                ll0.f38430a = null;
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
                if (!privacyControlActivity.f33858s0.h()) {
                    privacyControlActivity.f33859t0.N(86);
                    privacyControlActivity.f33860u0.f22710e.d();
                    return;
                }
                privacyControlActivity.f33859t0.L(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f33995q0.h()) {
                    profileActivity.V.N(86);
                    profileActivity.W.N(86);
                    org.telegram.ui.Components.dh0 dh0Var = profileActivity.f33884a0;
                    if (dh0Var != null) {
                        org.telegram.ui.Components.ah0 j3 = org.telegram.ui.Components.dh0.j(14, dh0Var.f25412a);
                        if (j3 != null && (xi0Var = j3.f24409k) != null) {
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
                profileActivity.V.L(0, false, false);
                profileActivity.W.L(0, false, false);
                return;
            case 15:
                ((j71) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f34156b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34157a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34223r = null;
                themeActivity.h = null;
                themeActivity.f34218n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ui1) obj).f41173u0.b();
                return;
        }
    }
}
