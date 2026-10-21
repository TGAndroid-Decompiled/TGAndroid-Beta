package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class w5 implements DialogInterface.OnDismissListener {
    public final int f42471a;
    public final Object f42472b;

    public w5(Object obj, int i10) {
        this.f42471a = i10;
        this.f42472b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.vj0 vj0Var;
        int i10 = this.f42471a;
        Object obj = this.f42472b;
        switch (i10) {
            case 0:
                ((x5) obj).f43038a.x0(false);
                return;
            case 1:
                ((s9) obj).f41403b.onFragmentDestroy();
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
                org.telegram.ui.Components.qc qcVar = ((org.telegram.ui.Components.qc[]) obj)[0];
                if (qcVar != null) {
                    qcVar.b();
                    return;
                }
                return;
            case 5:
                io ioVar = (io) obj;
                if (!ioVar.f38056s.g()) {
                    ioVar.R0.P(86);
                    ioVar.f38036b0.e.d();
                    return;
                }
                ioVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33131x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                s60 s60Var = (s60) obj;
                if (!s60Var.N.g()) {
                    s60Var.R.P(86);
                    s60Var.f41377f.d();
                    return;
                }
                s60Var.R.N(0, false, false);
                return;
            case 8:
                ne0 ne0Var = (ne0) obj;
                org.telegram.ui.Components.vj0 vj0Var2 = ne0Var.I;
                jd jdVar = ne0Var.f39557n;
                if (!ne0Var.L.g()) {
                    jdVar.setAnimation(vj0Var2);
                    vj0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new zc0(ne0Var, 2));
                    jdVar.d();
                    return;
                }
                jdVar.setAnimation(vj0Var2);
                vj0Var2.N(0, false, false);
                ne0Var.K = true;
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
                if (!privacyControlActivity.f33557s0.g()) {
                    privacyControlActivity.f33558t0.P(86);
                    privacyControlActivity.f33559u0.e.d();
                    return;
                }
                privacyControlActivity.f33558t0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f33700r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.zh0 zh0Var = profileActivity.f33582a0;
                    if (zh0Var != null) {
                        org.telegram.ui.Components.wh0 j10 = org.telegram.ui.Components.zh0.j(14, zh0Var.f32902a);
                        if (j10 != null && (vj0Var = j10.f32113k) != null) {
                            vj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.q8 q8Var = profileActivity.N2;
                    if (q8Var != null) {
                        q8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 14:
                ((x51) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f33854b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f33855a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f33918r = null;
                themeActivity.h = null;
                themeActivity.f33913n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((hh1) obj).f37669u0.b();
                return;
        }
    }
}
